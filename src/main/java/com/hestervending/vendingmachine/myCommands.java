package com.hestervending.vendingmachine;

import org.springframework.shell.standard.ShellMethod;

import java.util.ArrayList;

import org.springframework.shell.standard.ShellComponent;

@ShellComponent
public class myCommands {

    @ShellMethod("Add two integers together.")
    public int add(int a, int b) {
        return a + b;
    }
    
    @ShellMethod("Add two integers together.")
    public String list1() {
        Item myItem = new Item();
        myItem.name = "M&M";
        return myItem.name;
    }
    @ShellMethod("List all people.")
    public ArrayList<Person> list() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ryan", 45));
        people.add(new Person("Logan", 64));
        people.add(new Person("Maxwell", 85));
        return people;
    }
  /*  @Override
	public void run(String... args) throws IOException {
		// TODO Auto-generated method stub
		ObjectMapper objectMapper = new ObjectMapper();
		
		Item item = objectMapper.readValue(new File("input.json"), Item.class);
		
		System.out.println(item);
		
	}*/
}
