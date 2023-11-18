package com.example.doamneajuta;

public class UserResponse {
    private String category;
    private String selectedOption;

    // Empty constructor required by Firebase
    public UserResponse() {
    }

    // Constructor to initialize the object
    public UserResponse(String category, String selectedOption) {
        this.category = category;
        this.selectedOption = selectedOption;
    }

    // Getter and setter methods
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }
}