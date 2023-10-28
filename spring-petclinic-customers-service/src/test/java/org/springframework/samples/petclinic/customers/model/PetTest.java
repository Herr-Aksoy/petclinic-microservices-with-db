package org.springframework.samples.petclinic.customers.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;      
///home/ec2-user/petclinic-microservices-with-db/spring-petclinic-customers-service/src/main/java/org/springframework/samples/petclinic/customers/model/Pet.java
//üstdeki yolda bulunan java kodunu test ediyyoruz.
import org.junit.jupiter.api.Test;
public class PetTest {
    @Test
    public void testGetName(){
        //Arrange Burada mantik ismi veriyor ve o isim geldi mi diye bakiyor
        Pet pet = new Pet();
        //Act   Test bu sekilde 
        pet.setName("Fluffy");
        //Assert
        assertEquals("Fluffy", pet.getName());
    }
    @Test
    public void testGetOwner(){
        //Arrange
        Pet pet = new Pet();
        Owner owner = new Owner();
        owner.setFirstName("Call");
        //Act
        pet.setOwner(owner);
        //Assert
        assertEquals("Call", pet.getOwner().getFirstName());
    }
    @Test
    public void testBirthDate(){
        //Arrange
        Pet pet = new Pet();
        Date bd = new Date();
        //Act
        pet.setBirthDate(bd);
        //Assert
        assertEquals(bd,pet.getBirthDate());
    }
}