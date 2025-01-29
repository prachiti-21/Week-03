package com.singly_linked_list.social_media_friend_connections;

class SocialMediaManager {
    private User head;

    // Add a new user
    public void addUser(int userID, String name, int age) {
        User newUser = new User(userID, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    // Add a friend connection between two users
    public void addFriend(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 != null && user2 != null && userID1 != userID2) {
            addFriendToList(user1, userID2);
            addFriendToList(user2, userID1);
        } else {
            System.out.println("Invalid user IDs or connection already exists.");
        }
    }

    private void addFriendToList(User user, int friendID) {
        FriendNode newFriend = new FriendNode(friendID);
        if (user.friendList == null) {
            user.friendList = newFriend;
        } else {
            FriendNode temp = user.friendList;
            while (temp.next != null) {
                if (temp.friendID == friendID) {
                    return; // Friend already exists
                }
                temp = temp.next;
            }
            if (temp.friendID != friendID) {
                temp.next = newFriend;
            }
        }
    }

    // Remove a friend connection between two users
    public void removeFriend(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 != null && user2 != null) {
            removeFriendFromList(user1, userID2);
            removeFriendFromList(user2, userID1);
        } else {
            System.out.println("Invalid user IDs.");
        }
    }

    private void removeFriendFromList(User user, int friendID) {
        FriendNode temp = user.friendList;
        FriendNode prev = null;

        while (temp != null) {
            if (temp.friendID == friendID) {
                if (prev == null) {
                    user.friendList = temp.next;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userID1, int userID2) {
        User user1 = findUserByID(userID1);
        User user2 = findUserByID(userID2);

        if (user1 != null && user2 != null) {
            System.out.print("Mutual Friends: ");
            FriendNode temp1 = user1.friendList;
            while (temp1 != null) {
                if (isFriend(user2, temp1.friendID)) {
                    System.out.print(temp1.friendID + " ");
                }
                temp1 = temp1.next;
            }
            System.out.println();
        } else {
            System.out.println("Invalid user IDs.");
        }
    }

    private boolean isFriend(User user, int friendID) {
        FriendNode temp = user.friendList;
        while (temp != null) {
            if (temp.friendID == friendID) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Display all friends of a specific user
    public void displayFriends(int userID) {
        User user = findUserByID(userID);
        if (user != null) {
            System.out.print("Friends of User " + userID + ": ");
            FriendNode temp = user.friendList;
            while (temp != null) {
                System.out.print(temp.friendID + " ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("User not found.");
        }
    }

    // Search for a user by Name or User ID
    public void searchUser(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("User Found: " + temp.name + " (ID: " + temp.userID + ")");
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }

    public void searchUser(int userID) {
        User user = findUserByID(userID);
        if (user != null) {
            System.out.println("User Found: " + user.name + " (ID: " + user.userID + ")");
        } else {
            System.out.println("User not found.");
        }
    }

    // Count the number of friends for each user
    public void countFriends() {
        User temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode friendTemp = temp.friendList;
            while (friendTemp != null) {
                count++;
                friendTemp = friendTemp.next;
            }
            System.out.println("User " + temp.userID + " has " + count + " friend(s).");
            temp = temp.next;
        }
    }

    // Helper method to find a user by ID
    private User findUserByID(int userID) {
        User temp = head;
        while (temp != null) {
            if (temp.userID == userID) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}