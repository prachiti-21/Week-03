package com.merge_sort;

import java.util.Arrays;

public class SortPrice {
    public static void conquer(int price[],int si,int mid,int ei){
        int merged[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=ei){
            if(price[idx1]<=price[idx2]){
                 merged[x++]=price[idx1++];
            }
            else{
                merged[x++]=price[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=price[idx1++];
        }
        while(idx2<=ei){
            merged[x++]=price[idx2++];
        }
        for(int i=0 , j=si;i<merged.length;i++,j++){
            price[j]=merged[i];
        }
    }
    public static void divide(int price[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(price,si,mid);
        divide(price,mid+1,ei);
        conquer(price,si,mid,ei);
    }

    public static void main(String[] args) {
        int price[]={100,400,200,500,150};
        int n=price.length;
        divide(price,0,n-1);

        System.out.println(Arrays.toString(price));
    }
}
