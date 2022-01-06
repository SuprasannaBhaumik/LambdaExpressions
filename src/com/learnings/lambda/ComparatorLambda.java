package com.learnings.lambda;

import com.learnings.lambda.model.Movies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {


    public static void main(String[] args) {


        List<Movies> movies = new ArrayList<Movies>(
                List.of(
                        new Movies("Terminator",1997, "Thriller"),
                        new Movies("Titanic",1997, "Romance"),
                        new Movies("Avatar",2001, "Thriller"),
                        new Movies("Matrix", 2001, "Action"),
                        new Movies("DieHard", 2005, "Action"),
                        new Movies("Mars",2015, "Thriller"),
                        new Movies("Mission Impossible", 2015, "Action")
                ));


        //sort movies based on their length
        Comparator<Movies> nameComparator = (m1, m2) -> Integer.compare(m1.getName().length(), m2.getName().length());

        //sort movies based on their year
        Comparator<Movies> yearComparator = (m1, m2) -> Integer.compare(m1.getYear(), m2.getYear());

        //compare based on year
        movies.sort(yearComparator);
        System.out.println("Year Comparator -> " + movies);
        System.out.println("---------------------------");

        //compare based on name
        movies.sort(nameComparator);
        System.out.println("Name length comparator -> " + movies);
        System.out.println("---------------------------");

        //compare based on name, followed by year
        movies.sort(nameComparator.thenComparing(yearComparator));
        System.out.println("Name then year -> " + movies);
        System.out.println("---------------------------");

        //compare based on year, followed by name
        movies.sort(yearComparator.thenComparing(nameComparator));
        System.out.println("Year then Name -> " + movies);
        System.out.println("---------------------------");

        //compare based on name in nature lexical order
        movies.sort((m1, m2) -> m1.getName().compareTo(m2.getName()));
        System.out.println("Natural ordering based on name -> " + movies);
        System.out.println("---------------------------");

    }
}
