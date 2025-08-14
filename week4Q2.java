import java.util.*;

class LibraryItem {
    String title, author, id; boolean issued;
    public LibraryItem(String t, String a, String i) { title=t; author=a; id=i; }
    public void issue() { issued=true; }
    public void returnItem(int d) { issued=false; }
    public double lateFee(int d) { return d*2; }
}

class Book extends LibraryItem {
    public Book(String t, String a, String i) { super(t,a,i); }
    public double lateFee(int d) { return d; }
}

class Magazine extends LibraryItem {
    public Magazine(String t, String a, String i) { super(t,a,i); }
    public double lateFee(int d) { return d*1.5; }
}

class DVD extends LibraryItem {
    public DVD(String t, String a, String i) { super(t,a,i); }
    public double lateFee(int d) { return d*3; }
}

class Library {
    ArrayList<LibraryItem> items = new ArrayList<>();
    public void add(LibraryItem i) { items.add(i); }
    public LibraryItem find(String id) { for(LibraryItem i:items)if(i.id.equals(id))return i; return null; }
    public void issue(String id) { LibraryItem i=find(id); if(i!=null&&!i.issued)i.issue(); }
    public void returnItem(String id,int d) { LibraryItem i=find(id); if(i!=null&&i.issued)System.out.println(i.lateFee(d)); i.returnItem(d); }
}

public class week4Q2 {
    public static void main(String[] args) {
        Library l=new Library();
        l.add(new Book("B","A","1"));
        l.add(new Magazine("M","B","2"));
        l.add(new DVD("D","C","3"));
        l.issue("1");
        l.returnItem("1",2);
    }
}