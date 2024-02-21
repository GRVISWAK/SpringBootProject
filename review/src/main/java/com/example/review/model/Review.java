package com.example.review.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Table(name = "Review")
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int range;
    private String dogBreed;
    private int Pincode;

    public Review() {}

        public Review(int range,String dogBreed,  int Pincode) {
        
            this.range = range;
            this.dogBreed = dogBreed;
            this.Pincode = Pincode;
        }

        public String getDogBreed() {
            return dogBreed;
        }

        public void setDogBreed(String dogBreed) {
            this.dogBreed = dogBreed;
        }

        public int getRange() {
            return range;
        }

        public void setRange(int range) {
            this.range = range;
        }

        public int getPincode() {
            return Pincode;
        }

        public void setPincode(int Pincode) {
            this.Pincode = Pincode;
        } 
}