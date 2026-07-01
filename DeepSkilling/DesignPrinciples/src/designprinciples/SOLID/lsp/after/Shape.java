package designprinciples.SOLID.lsp.after;

interface Shape {
	
	int area();

}

//The idea is to stop making Square inherit from Rectangle as they both have different 
//behavior and to make a single interface to introduce common abstraction.
