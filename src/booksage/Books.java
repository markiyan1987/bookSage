package booksage;

public class Books  implements java.io.Serializable {
     private Integer id;
     private Authors authors;
     private String name;
     private int price;

    public Books() {
    }

    public Books(Authors authors, String name, int price) {
       this.authors = authors;
       this.name = name;
       this.price = price;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Authors getAuthors() {
        return this.authors;
    }
    
    public void setAuthors(Authors authors) {
        this.authors = authors;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
}


