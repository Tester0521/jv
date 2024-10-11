
#[derive(Clone)]
pub enum Grade {
	Two = 2,
	Three = 3,
	Four = 4,
	Five = 5,
}


pub struct Student {
	pub name: String,
	grades: Vec<u8>,
}


impl Student {
	pub fn new<S>(name: S) -> Student where S: Into<String> {
		Student { name: name.into(), grades: vec![] }
	}

	pub fn push(&mut self, n: Grade) { 
		self.grades.push(n as u8);
	}

	pub fn replace(&mut self, n: Grade, i: usize) {
		self.grades[i] = n as u8;
	}

	pub fn fill_grades(&mut self, arr: Vec<Grade>) {
		arr.iter().for_each(|el| self.push(el.clone()));
	}

	pub fn fill_grades_u8(&mut self, arr: Vec<u8>) {
		arr.iter().for_each(|el| self.push(Grade::from_u8(el.clone())));
	}

	pub fn get_grades(&self) -> Vec<u8> {
		return self.grades.clone();
	}

	pub fn get_average(&self) -> u8 {
		return ( (self.grades.iter().sum::<u8>() as usize) / self.grades.len() ) as u8;
	}

	pub fn is_full_support(&self) -> String {
		if let 5 = self.get_average() {
			return "отличник".to_string();
		} else {
			return "не отличник".to_string();
		}
	}


	pub fn to_string(&self) -> String {
		return format!("{}: {:?}", self.name, self.grades);
	}
}

impl Grade {
	pub fn from_u8(n: u8) -> Grade {
		match n {
			2 => Grade::Two,
			3 => Grade::Three,
			4 => Grade::Four,
			5 => Grade::Five,
			_ => panic!("invalid val!"),
		}
	}
}


