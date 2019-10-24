import java.util.ArrayList;
import java.util.Scanner;
public class Student {
    private String FirstName, LastName, id, year, email, address, city, state, zipcode;

    public void student() {
        this.FirstName = "";
        this.LastName = "";
        this.id = "";
        this.year = "";
        this.email = "";
        this.address = "";
        this.city = "";
        this.state = "";
        this.zipcode = "";
    }

    public void getinfo() {
        Scanner myObj = new Scanner(System.in);
        String FirstName = getName("First Name");
        String LastName = getName("Last Name");
        String id = getID();
        String year = getClassification();
        String email = getEmail();
        String address = getAddress();
        String city = getCity();
        String state = getState();
        String zipcode = getZipcode();

        this.FirstName = FirstName;
        this.LastName = LastName;
        this.id = id;
        this.year = year;
        this.email = email;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public void displayinfo() {
        System.out.println(FirstName+"\t"+LastName+"\t"+id+"\t"+year+"\t"+email+"\t"+address+"\t"+city+"\t"+state+"\t"+zipcode+"\n");
    }

    static public int count(ArrayList<Student> students) {
        return students.size();
    }

    private String getName(String Caption) {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("Enter " + Caption + ": ");
            String FirstName = myObj.nextLine();
            FirstName = FirstName.trim();
            boolean Success = true;
            for (int i = 0; i < FirstName.length(); i++) {
                boolean validcharacter = Character.isLetter(FirstName.charAt(i));
                if (validcharacter == false) {
                    System.out.println("Invalid " + Caption);
                    Success = false;
                    break;
                }
            }
            if (Success == true)
                return FirstName;
        }
    }

    private String getID() {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Student ID: ");
            String id = myObj.nextLine();
            id = id.trim();
            boolean Success = true;
            if (id.length() > 7 || id.length() < 1) {
                System.out.println("Invalid ID");
                continue;
            }
            for (int i = 0; i < id.length(); i++) {
                boolean validcharacter = Character.isDigit(id.charAt(i));
                if (validcharacter == false) {
                    System.out.println("Invalid ID");
                    Success = false;
                    break;
                }
            }
            if (Success == true)
                return id;
        }
    }

    private String getClassification() {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Classification: ");
            String year = myObj.nextLine();
            year = year.trim();
            if (year.equals("freshman"))
                return year;
            if (year.equals("sophomore"))
                return year;
            if (year.equals("junior"))
                return year;
            if (year.equals("senior"))
                return year;
            System.out.println("Invalid Classification");
        }
    }

    private String getAddress() {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Address Line: ");
            String address = myObj.nextLine();
            address = address.trim();
            int space = address.indexOf(' ');
            if (space < 0) {
                System.out.println("Invalid Address");
                continue;
            }
            String street = address.substring(space + 1);
            String number = address.substring(0, space);
            boolean Success = true;
            for (int i = 0; i < number.length(); i++) {
                boolean validcharacter = Character.isDigit(number.charAt(i));
                if (validcharacter == false) {
                    System.out.println("Invalid Address");
                    Success = false;
                    break;
                }
            }
            if (Success == false)
                continue;
            Success = true;
            for (int i = 0; i < street.length(); i++) {
                char char1 = street.charAt(i);
                boolean validcharacter = Character.isLetter(char1) || char1 == (' ');
                if (validcharacter == false) {
                    System.out.println("Invalid Address");
                    Success = false;
                    break;
                }
            }
            if (Success == false)
                continue;
            return address;
        }
    }

    private String getCity() {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("Enter City: ");
            String city = myObj.nextLine();
            city = city.trim();
            boolean Success = true;
            for (int i = 0; i < city.length(); i++) {
                char char1 = city.charAt(i);
                boolean validcharacter = Character.isLetter(char1) || char1 == (' ');
                if (validcharacter == false) {
                    System.out.println("Invalid City");
                    Success = false;
                    break;
                }
            }
            if (Success == false)
                continue;
            return city;
        }
    }

    private String getState() {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("Enter State: ");
            String state = myObj.nextLine();
            state = state.trim();
            boolean Success = true;
            if (state.equals("AK"))
                return state;
            else if (state.equals("AL"))
                return state;
            else if (state.equals("AR"))
                return state;
            else if (state.equals("AZ"))
                return state;
            else if (state.equals("CA"))
                return state;
            else if (state.equals("CO"))
                return state;
            else if (state.equals("CT"))
                return state;
            else if (state.equals("DC"))
                return state;
            else if (state.equals("DE"))
                return state;
            else if (state.equals("FL"))
                return state;
            else if (state.equals("GA"))
                return state;
            else if (state.equals("HI"))
                return state;
            else if (state.equals("IA"))
                return state;
            else if (state.equals("ID"))
                return state;
            else if (state.equals("IL"))
                return state;
            else if (state.equals("IN"))
                return state;
            else if (state.equals("KS"))
                return state;
            else if (state.equals("KY"))
                return state;
            else if (state.equals("LA"))
                return state;
            else if (state.equals("MA"))
                return state;
            else if (state.equals("MD"))
                return state;
            else if (state.equals("ME"))
                return state;
            else if (state.equals("MI"))
                return state;
            else if (state.equals("MN"))
                return state;
            else if (state.equals("MO"))
                return state;
            else if (state.equals("MS"))
                return state;
            else if (state.equals("MT"))
                return state;
            else if (state.equals("NC"))
                return state;
            else if (state.equals("ND"))
                return state;
            else if (state.equals("NE"))
                return state;
            else if (state.equals("NH"))
                return state;
            else if (state.equals("NJ"))
                return state;
            else if (state.equals("NM"))
                return state;
            else if (state.equals("NV"))
                return state;
            else if (state.equals("NY"))
                return state;
            else if (state.equals("OH"))
                return state;
            else if (state.equals("OK"))
                return state;
            else if (state.equals("OR"))
                return state;
            else if (state.equals("PA"))
                return state;
            else if (state.equals("RI"))
                return state;
            else if (state.equals("SC"))
                return state;
            else if (state.equals("SD"))
                return state;
            else if (state.equals("TN"))
                return state;
            else if (state.equals("TX"))
                return state;
            else if (state.equals("UT"))
                return state;
            else if (state.equals("VA"))
                return state;
            else if (state.equals("VT"))
                return state;
            else if (state.equals("WA"))
                return state;
            else if (state.equals("WI"))
                return state;
            else if (state.equals("WV"))
                return state;
            else if (state.equals("WY"))
                return state;
            else System.out.println("Invalid State");
        }
    }

    private String getZipcode() {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 9-digit Zipcode: ");
            String zipcode = myObj.nextLine();
            zipcode = zipcode.trim();
            boolean Success = true;
            if (zipcode.length() != 9) {
                System.out.println("Invalid Zipcode");
                continue;
            }
            for (int i = 0; i < zipcode.length(); i++) {
                boolean validcharacter = Character.isDigit(zipcode.charAt(i));
                if (validcharacter == false) {
                    System.out.println("Invalid Zipcode");
                    Success = false;
                    break;
                }
            }
            if (Success == true)
                return zipcode;
        }
    }

    private String getEmail() {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("Enter E-mail: ");
            String email = myObj.nextLine();
            email = email.trim();
            int at = email.indexOf('@');
            int dot = email.lastIndexOf('.');
            if (at < 0) {
                System.out.println("Invalid Email");
                continue;
            }
            if (dot < 0) {
                System.out.println("Invalid Email");
                continue;
            }
            if (at > dot) {
                System.out.println("Invalid Email");
                continue;
            }
            String username = email.substring(0, at);
            String domain = email.substring(at + 1, dot);
            String ext = email.substring(dot + 1);
            boolean success = false;
            if (ext.equals("com"))
                success = true;
            else if (ext.equals("edu"))
                success = true;
            else if (ext.equals("gov"))
                success = true;
            if (success == false)
                continue;

            success = true;
            for (int i = 0; i < domain.length(); i++) {
                boolean validcharacter = Character.isLetter(domain.charAt(i));
                if (validcharacter == false) {
                    System.out.println("Invalid Email");
                    success = false;
                    break;
                }
            }
            success = true;
            for (int i = 0; i < username.length(); i++) {
                char char1 = username.charAt(i);
                boolean validcharacter = Character.isLetter(char1) || Character.isDigit(char1) || char1 == ('.') || char1 == ('_') || char1 == ('-');
                if (validcharacter == false) {
                    System.out.println("Invalid Email");
                    success = false;
                    break;
                }
            }
            if (success == false)
                continue;
            return email;
        }
    }
}