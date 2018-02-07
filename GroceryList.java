package com.dnxth;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList <String> groceryList  = new ArrayList<String>();

    public void addItem(String item) {

        groceryList.add(item);

    }


    public void printGroceries(){

        System.out.println("there are "+ groceryList.size() + "items in Grocereis list");
        for (int i=0; i<groceryList.size(); i++){
            System.out.println("item " + groceryList.get(i));
        }
    }

    public void removeGrocery(int position){

        String theItem = groceryList.get(position);
        groceryList.remove(theItem);
        System.out.println("item remooved");
    }

    public int findItem(String item){

        int position =0;

        for(int i=0; i <= groceryList.size(); i++){

            if (item == groceryList.get(i)){

                position= i;
            }
        }
        return position;
    }

}
