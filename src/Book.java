public class Book {
    private String name;
    private Author author;
    private int yearOfPublishing;


    public Book(String name, Author author, int yearOfPublishing){
        this.name=name;
        this.author=author;
        this.yearOfPublishing=yearOfPublishing;
    }
    public String  toString(){
        return name +" "+ author + " " + yearOfPublishing + " ";
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public int getYearOfPublishing(){
        return yearOfPublishing;
    }
    public int setYearOfPublishing(){
        this.yearOfPublishing = yearOfPublishing;
        return yearOfPublishing;
    }
    public boolean equals(Object other){
        if(this.getClass() != other.getClass()){
            return false;
        }
        Book book1 = (Book) other;
        return name.equals(book1.name);
    }
    public int hashCode(){
        return java.util.Objects.hash(name);
    }
}
