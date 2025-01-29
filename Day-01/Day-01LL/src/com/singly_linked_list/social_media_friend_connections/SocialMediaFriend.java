package com.singly_linked_list.social_media_friend_connections;

public class SocialMediaFriend {
    public static void main(String[] args) {
        SocialMediaManager manager = new SocialMediaManager();

        manager.addUser(1, "Alice", 25);
        manager.addUser(2, "Bob", 30);
        manager.addUser(3, "Charlie", 28);

        manager.addFriend(1, 2);
        manager.addFriend(1, 3);

        manager.displayFriends(1);
        manager.displayFriends(2);

        manager.findMutualFriends(1, 2);

        manager.searchUser("Alice");
        manager.searchUser(3);

        manager.countFriends();

        manager.removeFriend(1, 2);
        manager.displayFriends(1);
        manager.countFriends();
    }
}
