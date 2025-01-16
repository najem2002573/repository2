package ex4.ex4;

/**
 * Hello world!
 * /**
 * Hello world!
 *
 */

/*
 *		    שמות סטודנטים:
 *		    נגים אלדין זועבי 324887983
			אחמד זועבי       213027667

 */
 

public class Triangle_clf_types {

	enum Triangle_Types {
		equilateral, isosceles, Scalene, Nottriangle, ERROR

	}
	Triangle_Types types;
		public static String classifyTriangle(int a, int b, int c) {
			Triangle_Types triangle;
		        if (a + b > c) {
		            if ( a + c > b) {
		                if (b + c > a) {
		                    if (a == b) {
		                        if (b == c) {
		                            triangle =Triangle_Types.equilateral ;
		                        } else {
		                            triangle = Triangle_Types.isosceles;
		                        }
		                    } else if (a == c) {
		                        triangle = Triangle_Types.isosceles;
		                    } else if (b == c) {
		                        triangle = Triangle_Types.isosceles;
		                    } else {
		                        triangle = Triangle_Types.Scalene;
		                    }
		                } else {
		                    triangle = Triangle_Types.Nottriangle;
		                }
		            } else {
		                triangle = Triangle_Types.Nottriangle;
		            }
		        } else {
		            triangle = Triangle_Types.Nottriangle;
		        }
		        return triangle.toString();

		
	}
}
