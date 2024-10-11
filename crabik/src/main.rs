pub mod student;

use student::{ Student, Grade };

fn main() {
    let mut student1 = Student::new("Vasya");
    let mut student2 = Student::new("Peter");
    let mut student3 = Student::new("Adnrew");
    let mut student4 = Student::new("Maksim");

    student1.push(Grade::Three);
    student1.push(Grade::Four);
    student1.push(Grade::Five);

    student2.fill_grades_u8(student1.get_grades());

    student1.replace(Grade::Five, 0);

    student3.fill_grades_u8(student1.get_grades());

    student4.fill_grades([Grade::Five, Grade::Five, Grade::Five, Grade::Five].to_vec());


    println!("{}\n", student1.to_string());
    println!("{}\n", student2.to_string());
    println!("{}\n", student3.to_string());
    println!("{}, кстати он {}\n", student4.to_string(), student4.is_full_support());
}