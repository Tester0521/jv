pub mod student;

use student::Student;

fn main() {
    let mut student1 = Student::new("Vasya");
    let mut student2 = Student::new("Peter");
    let mut student3 = Student::new("Adnrew");

    student1.push(3);
    student1.push(4);
    student1.push(5);

    student2.fill(student1.get_grades());

    student1.replace(5, 0);

    student3.fill(student1.get_grades());


    println!("{}\n", student1.to_string());
    println!("{}\n", student2.to_string());
    println!("{}\n", student3.to_string());
}
