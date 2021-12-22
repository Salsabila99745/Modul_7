/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author FauziahKhoerunnisa
 */
public class Course {
    private String CourseName;
    private String CourseId;
    private String CourseCategory;
    
    public String getId() {
        //mengembalikan nilai id Course
        return CourseId;
    }

    public void setId(String id) {
        //set id Course
        CourseId =  id;
    }

    public String getName() {
        //Mengembalikan Nama Course
        return CourseName;
    }

    public void setName(String name) {
        //set Nama Course
        CourseName = name;
    }

    public String getCategory() {
        //Mengembalikan kategori Course
        return CourseCategory;
    }

    public void setCategory(String category) {
        //set Kategori Course
        CourseCategory = category;
    }
}
