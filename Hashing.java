package com.company;

import java.util.HashMap;

public class Hashing {

    public static void main(String[] args){

        HashMap map = new HashMap();

        //adding items
        map.put("Name","Sharika");
        map.put("Age",20);

        System.out.println(map);

        //restricting the items and keys of my hashmap
        HashMap<String, Integer> map1 = new HashMap();
        map1.put("Name",100);
        map1.put("Age",20);

        System.out.println(map1);

        //creating hashmap from another
        HashMap<String,Integer> newMap = new HashMap<>(map);
        newMap.put("wrg",34);
        System.out.println(newMap);


        //Accessing items
        System.out.println(map.get("Name"));
        System.out.println(map.getOrDefault("LOL",1)); //if the value doesnot exist then print 1 by default

        //getting the keys of hashmap
        System.out.println(map.keySet());

        //getting the values of hashmap
        System.out.println(map.values());

        //iteration
        for(String i : map1.keySet()){
            System.out.println(i+map1.get(i));
        }

        //Adding items using putAll
        map1.putAll(newMap); //putting all the items of newMap in map1 along with map1's elements
        System.out.println(map1);

        //adding items ifabsent
        
        map.put("Name","Saurav"); //this will overwrite the previous value
        map.putIfAbsent("love","Sharika"); //this will not overwrite instead it will check if the previous value exists then it will not overwrite but if it doesn't then it will enter the value
        System.out.println(map);

        //editting (replacing certain values)
        map.replace("Name","Sharika");
        System.out.println(map);

        
        //Removing values
        map.remove("love","Sharika"); //removing the key and the value
        System.out.println(map);
        map.remove("Age"); //removing by providing the key value only
        System.out.println(map);

        //both the remove function performs the same thing

        //Operations
        System.out.println(map.containsKey("Name")); //checking if a particular key exists or not - returns a boolean value
        System.out.println(map.containsValue("Sharika")); //for checking if a particular value exists or not - returns a boolean value
        System.out.println(map1.size()); //getting the size of the hashtable
        System.out.println(map.isEmpty()); //checking if the table is empty or not - returns a boolean value


        //--Question 1: count frequency from a string array

        String[] arr= {"Hello","Hello","Hi","Hello","How","Hi","How"};
        HashMap<String, Integer> map3 = new HashMap<>();
        for(String item:arr)
        {
            if(map3.containsKey(item)){
                map3.replace(item,map3.get(item) + 1);
            }
            else{
                map3.put(item,1);
            }
        }

        System.out.println(map3);

        //--Question 2: count max used word

        String arr1 = "Sharika is a great girl. She loves herself the most. She is struggling right now to be successful later. And indeed we know hard works pay off";
        HashMap<String, Integer> map4 = new HashMap<>();

        String[] textarr = arr1.split(" ");
        for(String item:textarr)
        {
            if(map4.containsKey(item)){
                map4.replace(item,map4.get(item) + 1);
            }
            else{
                map4.put(item,1);
            }
        }
        int max = 0;
        String maxKey = "";

        for(String key: map4.keySet()){
            if(map4.get(key)>max){
                max = map4.get(key);
                maxKey = key;
            }
        }

        System.out.println(maxKey);

        


    }
}
