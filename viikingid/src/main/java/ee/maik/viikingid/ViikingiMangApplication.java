package ee.maik.viikingid;

import ee.maik.viikingid.service.ManguHaldur;

public class ViikingiMangApplication {
	public static void main(String[] args) {
		ManguHaldur haldur = new ManguHaldur();
		haldur.alustaMangu();
	}
}