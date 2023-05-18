package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService
{
    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent( Student student )
    {
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        if ( students.containsKey( studentId ) )
        {
            return students.get( studentId );
        }
        return null;
    }

    public void showSummary()
    {
        //print out the student credentials and enrolled classes
        //iterate through student values
        System.out.println( "Students: " );
        for ( String key : students.keySet() )
        {
            Student student = students.get( key );
            System.out.println( student );
        }
        // reference the CourseServices class ln81-86
        //TODO implement
//        for (Student student : students.values()){
//            System.out.println("Student Name: " + student.getName());
//            System.out.println("Student ID: " + student.getId());
//            System.out.println("Student courses: " + student.getClass());
    }

    public void enrollToCourse( String studentId, Course course )
    {
        if ( students.containsKey( studentId ) )
        {
            students.get( studentId ).enrollToCourse( course );
        }
    }


}
