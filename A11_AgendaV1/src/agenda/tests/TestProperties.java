package agenda.tests;

import agenda.config.Config;

public class TestProperties {
	public static void main(String[] args) {
		System.out.println(Config.getPro().getProperty("bbdd.url"));
		System.out.println(Config.getPro().getProperty("bbdd.user"));
		System.out.println(Config.getPro().getProperty("bbdd.driver"));
	}
}
