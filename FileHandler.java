package library;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    public static void saveBooks(ArrayList<Book> books,String path){

        try(PrintWriter writer = new PrintWriter(new FileWriter(path))){

            for(Book b:books){
                writer.println(b.toFileString());
            }

        }catch(IOException e){
            System.out.println("Error saving books.");
        }
    }

    public static ArrayList<Book> loadBooks(String path){

        ArrayList<Book> books = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(path))){

            String line;

            while((line = reader.readLine()) != null){
                books.add(Book.fromFileString(line));
            }

        }catch(IOException e){
            System.out.println("Book file not found.");
        }

        return books;
    }
}