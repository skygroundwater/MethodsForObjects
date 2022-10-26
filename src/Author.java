public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString() {
        return "Автор "+firstName + " " + lastName;
    }
    public boolean equals(Object other){
        if(this.getClass() != other.getClass()){
            return false;
        }
        Author author1  = (Author) other;
        return firstName.equals(author1.firstName);
    }
    public int hashCode(){
        return java.util.Objects.hash(firstName);
    }
}
