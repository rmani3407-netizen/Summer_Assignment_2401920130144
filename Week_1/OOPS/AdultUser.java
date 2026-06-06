package Week_1.OOPS;

public class AdultUser implements LibraryUser {
    int age ;
    String bookType;
    @Override
    public void registerAccount(){
        if(age>12){
            System.out.println("you have successfully registered under an adult account");
        }
        else{
            System.out.println("sorry , age must be greater than 12 to register as an adult account");
        }
    }
    @Override
    public void requestBook(){
        if(bookType.equalsIgnoreCase("Fiction")){
            System.out.println("book issued successfully , please return the book within 7 days");
        }else{
            System.out.println("Oops, you are allowed to take adult fiction books");
        }
    }
    
    
}
