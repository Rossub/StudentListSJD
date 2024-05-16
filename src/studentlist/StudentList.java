package studentlist;
import javax.swing.JOptionPane;

public class StudentList {
    public static void main(String[] args) throws Exception {
        // String word = JOptionPane.showInputDialog("Enter a word: ");

        // char[] characters = new char[word.length()];
        // for (int i = 0; i < word.length(); i++){
        //     characters[i] = word.charAt(i);
        // }

        // System.out.println(characters);


        // String reversedWord = "";
        // for (int i = word.length() - 1; i >= 0; i--){
        //     reversedWord += characters[i];
        // }
        // System.out.println(reversedWord);

        Student[] students = new Student[5];
        students[0] = new Student("Kiran");
        students[1] = new Student("Kristin");
        students[2] = new Student("Gege");
        students[3] = new Student("Ryan");
        students[4] = new Student("Ahmed");


        for (Student students2 : students) {
            System.out.println(students2.getName());
            
       }
    }
   
}
