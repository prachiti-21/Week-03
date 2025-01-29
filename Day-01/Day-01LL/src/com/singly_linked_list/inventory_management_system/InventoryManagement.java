package com.singly_linked_list.inventory_management_system;

/*class Item {
    String itemname;
    int itemId;
    int quantity;
    double price;
    Item next;
    Item(String itemname,int itemId,int quantity,double price){
        this.itemname=itemname;
        this.itemId=itemId;
        this.quantity=quantity;
        this.price=price;
        this.next=null;
    }

}
class Inventory {
    private Item head;

    public void addAtBeginning(String itemname, int itemId, int quantity, double price) {
        Item item = new Item(itemname, itemId, quantity, price);
        item.next = head;
        head = item;
    }

    public void addAtEnd(String itemname, int itemId, int quantity, double price) {
        Item item = new Item(itemname, itemId, quantity, price);
        if (head == null) {
            head = item;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = item;
    }

    public void addAtPosition(int position, String itemname, int itemId, int quantity, double price) {
        Item item = new Item(itemname, itemId, quantity, price);
        if (position < 1) {
            System.out.println("invalid position");
        } else if (position == 1) {
            addAtBeginning(itemname, itemId, quantity, price);
        }
        Item temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }
        item.next = temp.next;
        temp.next = item;
    }

    public void removeItem(int itemId) {
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    public void updateQuantity(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                System.out.println("Quantity updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    public void searchItem(int itemId) {
        Item temp = head;
        while (temp.next != null) {
            if (temp.itemId == itemId) {
                System.out.println("Item found with item ID: " + temp.itemId);
            }
            temp = temp.next;
        }
        System.out.println("Item not found");

    }

    public void calculateTotalInventory(double price, int quantity) {
        Item temp = head;
        double total;
        double sum = 0;
        while (temp.next != null) {
            total = temp.price * temp.quantity;
            sum += total;
            temp = temp.next;
        }
        System.out.println("Total Inventory is: " + sum);
    }

    public void sortByItemName() {
        if (head == null || head.next == null) {
            return;
        }
        head = mergeSortByName(head);
    }

    private Item mergeSortByName(Item head) {
        if (head == null || head.next == null) {
            return head;
        }
        Item middle = getMiddle(head);
        Item nextOfMiddle = middle.next;
        middle.next = null;

        Item left = mergeSortByName(head);
        Item right = mergeSortByName(nextOfMiddle);

        return sortedMergeByName(left, right);
    }

    private Item sortedMergeByName(Item left, Item right) {
        if (left == null) return right;
        if (right == null) return left;

        Item result;
        if (left.itemname.compareToIgnoreCase(right.itemname) <= 0) {
            result = left;
            result.next = sortedMergeByName(left.next, right);
        } else {
            result = right;
            result.next = sortedMergeByName(left, right.next);
        }
        return result;
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Display all items in the inventory
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Item temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.itemname + ", ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }
}*/
    public class InventoryManagement{
        public static void main(String[] args) {
            Inventory inventory=new Inventory();
            inventory.addAtEnd("ItemA", 101, 50, 20.5);
            inventory.addAtBeginning("ItemB", 102, 30, 15.0);
            inventory.addAtPosition(2, "ItemC", 103, 40, 25.0);

            inventory.displayInventory();
            inventory.searchItem(102);
            inventory.updateQuantity(103, 60);
            inventory.calculateTotalInventory(100,2);

            System.out.println("\nSorting by Item Name:");
            inventory.sortByItemName();
            inventory.displayInventory();

            inventory.removeItem(101);
            inventory.displayInventory();
        }
    }








