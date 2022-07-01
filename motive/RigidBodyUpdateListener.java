package motive;

/**
 * A listener interface that allows listening for movement 
 * of a rigid body within Motive
 * @author Lauren Knight
 */
public interface RigidBodyUpdateListener {
    void rigidBodyUpdateReceived(int id, float x, float y, float z,
            float a, float b, float c, float d);
}
