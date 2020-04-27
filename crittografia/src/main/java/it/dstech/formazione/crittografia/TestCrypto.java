package it.dstech.formazione.crittografia;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class TestCrypto {

	private static final String CHIAVE = "Mary has one ca1";

	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException,
			IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1. crypt \n2. decrypt");
			int nextInt = scanner.nextInt();
			scanner.nextLine();
			switch (nextInt) {
			case 1: {
				System.out.println("Dammi il testo da cryuptare");
				String testo = scanner.nextLine();
				String codifica = Utility.encrypt(testo,CHIAVE );
				System.out.println(codifica);

				break;
			}
			case 2: {

				System.out.println("Dammi il testo da decryptare");
				String testo = scanner.nextLine();
				String codifica = Utility.decrypt(testo,CHIAVE );
				System.out.println(codifica);
				break;
			}
			default: {
				System.exit(0);
			}
			}

		}

	}

}
