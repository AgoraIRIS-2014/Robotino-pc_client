package API;
import java.awt.*;

public interface RobotListener {
	void onConnected();
	void onDisconnected();
	void onError(rec.robotino.com.Com.Error error);
	void onImageReceived(Image img);
}
