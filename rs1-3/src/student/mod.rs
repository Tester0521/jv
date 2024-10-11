


pub struct Student {
	pub name: String,
	pub grades: Vec<u8>,
}


impl Student {
	pub fn new<S>(name: S) -> Student where S: Into<String> {
		Student { name: name.into(), grades: vec![] }
	}

	pub fn push(&mut self, n: u8) { 
		self.grades.push(n);
	}

	pub fn replace(&mut self, n: u8, i: usize) {
		self.grades[i] = n;
	}

	pub fn fill(&mut self, arr: Vec<u8>) {
		self.grades = arr;
	}

	pub fn get_grades(&self) -> Vec<u8> {
		return self.grades.clone();
	}


	pub fn to_string(&self) -> String {
		return format!("{}: {:?}", self.name, self.grades);
	}
}


