/*
Interfaces
Exercise: 2-interfaces

define a Java testing class where you:
create 3 objects, 1 for each subclass type
invoke the goToCollege() method for each of the newly created objects
invoke the implemented methods from interfaces (1 for Student, 1 for Professor and 2 for Assistant)
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student("Marco","Rossi",95841,2022);
        student.goToCollege();
        student.studyAtHome();

        Professor professor = new Professor("Andrea","Verdi",89135,"Biology");
        professor.goToCollege();
        professor.teachToOtherPeople();

        Assistant assistant = new Assistant("Maria","Bianchi",62849,true);
        assistant.goToCollege();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
