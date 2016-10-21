
/*
 * Hari Guptha
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {

			int days, rating;
			double money;
			String input;

			Scanner s = new Scanner(System.in);
			System.out.println("Enter days from 1 to 31");
			input = s.next();
			// days = Integer.parseInt(input);
			// Pattern pattern = Pattern.compile("[1-31]");

			try {
				Pattern pattern = Pattern.compile("^(([0]?[1-9])|([1-2][0-9])|(3[01]))$");
				Matcher matcher = pattern.matcher(input);
				if (matcher.find()) {
					days = Integer.parseInt(input);

					System.out.println("Enter rating 1,3,5");
					input = s.next();

					Pattern pattern1 = Pattern.compile("1|3|5");
					Matcher matcher1 = pattern1.matcher(input);

					if (matcher1.find()) {
						rating = Integer.parseInt(input);

						System.out.println("Enter the amount to be spend");
						input = s.next();

						Pattern pattern2 = Pattern.compile("^[+]?([0-9]+(?:[\\.][0-9]*)?|\\.[0-9]+)$");
						Matcher matcher2 = pattern2.matcher(input);

						if (matcher2.find()) {
							money = Double.parseDouble(input);
							System.out.println(money );
							String st = Calculation.entry(money, days, rating);
							System.out.println(st);
							break;

						}

						else {
							throw new UserException("Provide a valid amount to be  spend");
						}

					}

					else {
						throw new UserException("Provide a correct star rating");
					}

				} else {
					throw new UserException("Provide a correct number of days");
				}
			} catch (UserException e) {
				System.out.println(e.getLocalizedMessage());
				System.out.println("\n\nTrying again  \n\n");
				continue;

			}

		}
	}

}
