@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean eighteen = true;
    assertEquals("Person's age is equal to or more than 18", eighteen , isAdult);
	// Напиши код здесь
}