package com.hestervending.vendingmachine;

import org.springframework.shell.standard.ShellMethod;

import java.util.ArrayList;
import java.util.*;

import org.springframework.shell.standard.ShellComponent;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

@ShellComponent
public class myCommands {
   

    @ShellMethod("Add two integers together.")
    public int add(int a, int b) {
        return a + b;
    }
    
    /*@ShellMethod("Add two integers together.")
    public String list1() {
        Item myItem = new Item();
        myItem.name = "M&M";
        return myItem.name;
    }*/
    @ShellMethod("List all people.")
    public ArrayList<Person> list5() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ryan", 45));
        people.add(new Person("Logan", 64));
        people.add(new Person("Maxwell", 85));
        return people;
    }
    @ShellMethod("Load JSON File")
	public JSON loadInput() throws IOException {
		// TODO Auto-generated method stub
		ObjectMapper objectMapper = new ObjectMapper();
        JSON json = objectMapper.readValue(new File("input.json"), JSON.class);
		
		//Item item = objectMapper.readValue(new File("Simple.json"), Item.class);
		
		return json;
		
	}

  

 

}
