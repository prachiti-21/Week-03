package com.singly_linked_list.inventory_management_system;

class Item {
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