package venture.Aust1n46.chat.xcut;

import com.comphenix.protocol.utility.MinecraftVersion;
import com.google.inject.Singleton;

@Singleton
public final class VersionService {
	public static final MinecraftVersion SERVER_VERSION = MinecraftVersion.getCurrentVersion();

	private VersionService() {
	}

	public boolean is1_7() {
		return SERVER_VERSION.getMinor() == 7 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean is1_8() {
		return SERVER_VERSION.getMinor() == 8 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean is1_9() {
		return SERVER_VERSION.getMinor() == 9 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean is1_10() {
		return SERVER_VERSION.getMinor() == 10 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean is1_11() {
		return SERVER_VERSION.getMinor() == 11 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean is1_12() {
		return SERVER_VERSION.getMinor() == 12 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean is1_13() {
		return SERVER_VERSION.getMinor() == 13 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean is1_14() {
		return SERVER_VERSION.getBuild() != 4 && SERVER_VERSION.getMinor() == 14 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean is1_14_4() {
		return SERVER_VERSION.getBuild() == 4 && SERVER_VERSION.getMinor() == 14 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean is1_15() {
		return SERVER_VERSION.getMinor() == 15 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean is1_16() {
		return SERVER_VERSION.getMinor() == 16 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean is1_17() {
		return SERVER_VERSION.getMinor() == 17 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean is1_18() {
		return SERVER_VERSION.getMinor() == 18 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean is1_19() {
		return SERVER_VERSION.getBuild() == 0 && SERVER_VERSION.getMinor() == 19 && SERVER_VERSION.getMajor() == 1;
	}

	public boolean isUnder_1_19() {
		if (SERVER_VERSION.getMajor() < 1) {
			return true;
		}
		return SERVER_VERSION.getMajor() == 1 && SERVER_VERSION.getMinor() < 19;
	}

	public boolean isAbove_1_19() {
		if (SERVER_VERSION.getMajor() < 1) {
			return false;
		}
		if (SERVER_VERSION.getMajor() > 1) {
			return true;
		}
		if (SERVER_VERSION.getMinor() > 19) {
			return true;
		}
		return SERVER_VERSION.getMinor() == 19 && SERVER_VERSION.getBuild() > 0;
	}
}
