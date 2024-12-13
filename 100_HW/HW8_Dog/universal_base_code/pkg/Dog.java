package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	public Dog() {
		this.name = "Clifford";
		this.age = 1;
		this.breed = "big dog";
	}
	public Dog(String nameInput){
		this.name = nameInput;
		this.age = 1;
		this.breed = "big dog";
	}
	public Dog(String nameInput, String breedInput){
		this.breed = breedInput;
		this.name = nameInput;
		this.age = 1;
	}
	public Dog(String nameInput, int ageInput){
		this.name = nameInput;
		this.age = ageInput;
		breed = "dog dog";
	}
	public void setName(String nameInput){
		this.name = nameInput;
	}
	public void setAge(int ageInput){
		this.age = ageInput;
	}
	public void setBreed(String breedInput){
		this.breed = breedInput;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public String getBreed(){
		return this.breed;
	}
	public boolean isSleeping(){
		int dog = (int)(Math.random()*2);
		return dog == 0;
	}
	public void bark(){
		System.out.println(name+" barks");
	}
}
