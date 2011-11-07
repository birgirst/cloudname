package org.cloudname.flags;

/**
 * Class containing an unsupported field type.
 * 
 * @author acidmoose
 *
 */
public class FlagsWrongVariable {

    @Flag(name="float", description="Illegal argument matching")
    public static float illegalArg = 0;
    
}
