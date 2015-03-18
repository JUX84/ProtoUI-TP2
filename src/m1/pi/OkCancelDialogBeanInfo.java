/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.pi;

import java.beans.*;

/**
 *
 * @author uapv1301804
 */
public class OkCancelDialogBeanInfo extends SimpleBeanInfo {

    // Bean descriptor//GEN-FIRST:BeanDescriptor
    /*lazy BeanDescriptor*/
    private static BeanDescriptor getBdescriptor(){
        BeanDescriptor beanDescriptor = new BeanDescriptor  ( m1.pi.OkCancelDialog.class , null ); // NOI18N//GEN-HEADEREND:BeanDescriptor
    // Here you can add code for customizing the BeanDescriptor.
        beanDescriptor.setValue("containerDelegate", "getjPanel1");
        return beanDescriptor;     }//GEN-LAST:BeanDescriptor


    // Property identifiers//GEN-FIRST:Properties
    private static final int PROPERTY_accessibleContext = 0;
    private static final int PROPERTY_alignmentX = 1;
    private static final int PROPERTY_alignmentY = 2;
    private static final int PROPERTY_background = 3;
    private static final int PROPERTY_backgroundSet = 4;
    private static final int PROPERTY_baselineResizeBehavior = 5;
    private static final int PROPERTY_bounds = 6;
    private static final int PROPERTY_colorModel = 7;
    private static final int PROPERTY_component = 8;
    private static final int PROPERTY_componentCount = 9;
    private static final int PROPERTY_componentListeners = 10;
    private static final int PROPERTY_componentOrientation = 11;
    private static final int PROPERTY_components = 12;
    private static final int PROPERTY_containerListeners = 13;
    private static final int PROPERTY_cursor = 14;
    private static final int PROPERTY_cursorSet = 15;
    private static final int PROPERTY_displayable = 16;
    private static final int PROPERTY_doubleBuffered = 17;
    private static final int PROPERTY_dropTarget = 18;
    private static final int PROPERTY_enabled = 19;
    private static final int PROPERTY_focusable = 20;
    private static final int PROPERTY_focusCycleRoot = 21;
    private static final int PROPERTY_focusCycleRootAncestor = 22;
    private static final int PROPERTY_focusListeners = 23;
    private static final int PROPERTY_focusOwner = 24;
    private static final int PROPERTY_focusTraversable = 25;
    private static final int PROPERTY_focusTraversalKeys = 26;
    private static final int PROPERTY_focusTraversalKeysEnabled = 27;
    private static final int PROPERTY_focusTraversalPolicy = 28;
    private static final int PROPERTY_focusTraversalPolicyProvider = 29;
    private static final int PROPERTY_focusTraversalPolicySet = 30;
    private static final int PROPERTY_font = 31;
    private static final int PROPERTY_fontSet = 32;
    private static final int PROPERTY_foreground = 33;
    private static final int PROPERTY_foregroundSet = 34;
    private static final int PROPERTY_graphics = 35;
    private static final int PROPERTY_graphicsConfiguration = 36;
    private static final int PROPERTY_height = 37;
    private static final int PROPERTY_hierarchyBoundsListeners = 38;
    private static final int PROPERTY_hierarchyListeners = 39;
    private static final int PROPERTY_ignoreRepaint = 40;
    private static final int PROPERTY_inputContext = 41;
    private static final int PROPERTY_inputMethodListeners = 42;
    private static final int PROPERTY_inputMethodRequests = 43;
    private static final int PROPERTY_insets = 44;
    private static final int PROPERTY_keyListeners = 45;
    private static final int PROPERTY_layout = 46;
    private static final int PROPERTY_lightweight = 47;
    private static final int PROPERTY_locale = 48;
    private static final int PROPERTY_location = 49;
    private static final int PROPERTY_locationOnScreen = 50;
    private static final int PROPERTY_maximumSize = 51;
    private static final int PROPERTY_maximumSizeSet = 52;
    private static final int PROPERTY_minimumSize = 53;
    private static final int PROPERTY_minimumSizeSet = 54;
    private static final int PROPERTY_mouseListeners = 55;
    private static final int PROPERTY_mouseMotionListeners = 56;
    private static final int PROPERTY_mousePosition = 57;
    private static final int PROPERTY_mouseWheelListeners = 58;
    private static final int PROPERTY_name = 59;
    private static final int PROPERTY_opaque = 60;
    private static final int PROPERTY_parent = 61;
    private static final int PROPERTY_peer = 62;
    private static final int PROPERTY_preferredSize = 63;
    private static final int PROPERTY_preferredSizeSet = 64;
    private static final int PROPERTY_propertyChangeListeners = 65;
    private static final int PROPERTY_showing = 66;
    private static final int PROPERTY_size = 67;
    private static final int PROPERTY_toolkit = 68;
    private static final int PROPERTY_treeLock = 69;
    private static final int PROPERTY_valid = 70;
    private static final int PROPERTY_validateRoot = 71;
    private static final int PROPERTY_visible = 72;
    private static final int PROPERTY_width = 73;
    private static final int PROPERTY_x = 74;
    private static final int PROPERTY_y = 75;

    // Property array 
    /*lazy PropertyDescriptor*/
    private static PropertyDescriptor[] getPdescriptor(){
        PropertyDescriptor[] properties = new PropertyDescriptor[76];
    
        try {
            properties[PROPERTY_accessibleContext] = new PropertyDescriptor ( "accessibleContext", m1.pi.OkCancelDialog.class, "getAccessibleContext", null ); // NOI18N
            properties[PROPERTY_alignmentX] = new PropertyDescriptor ( "alignmentX", m1.pi.OkCancelDialog.class, "getAlignmentX", null ); // NOI18N
            properties[PROPERTY_alignmentY] = new PropertyDescriptor ( "alignmentY", m1.pi.OkCancelDialog.class, "getAlignmentY", null ); // NOI18N
            properties[PROPERTY_background] = new PropertyDescriptor ( "background", m1.pi.OkCancelDialog.class, "getBackground", "setBackground" ); // NOI18N
            properties[PROPERTY_backgroundSet] = new PropertyDescriptor ( "backgroundSet", m1.pi.OkCancelDialog.class, "isBackgroundSet", null ); // NOI18N
            properties[PROPERTY_baselineResizeBehavior] = new PropertyDescriptor ( "baselineResizeBehavior", m1.pi.OkCancelDialog.class, "getBaselineResizeBehavior", null ); // NOI18N
            properties[PROPERTY_bounds] = new PropertyDescriptor ( "bounds", m1.pi.OkCancelDialog.class, "getBounds", "setBounds" ); // NOI18N
            properties[PROPERTY_colorModel] = new PropertyDescriptor ( "colorModel", m1.pi.OkCancelDialog.class, "getColorModel", null ); // NOI18N
            properties[PROPERTY_component] = new IndexedPropertyDescriptor ( "component", m1.pi.OkCancelDialog.class, null, null, "getComponent", null ); // NOI18N
            properties[PROPERTY_componentCount] = new PropertyDescriptor ( "componentCount", m1.pi.OkCancelDialog.class, "getComponentCount", null ); // NOI18N
            properties[PROPERTY_componentListeners] = new PropertyDescriptor ( "componentListeners", m1.pi.OkCancelDialog.class, "getComponentListeners", null ); // NOI18N
            properties[PROPERTY_componentOrientation] = new PropertyDescriptor ( "componentOrientation", m1.pi.OkCancelDialog.class, "getComponentOrientation", "setComponentOrientation" ); // NOI18N
            properties[PROPERTY_components] = new PropertyDescriptor ( "components", m1.pi.OkCancelDialog.class, "getComponents", null ); // NOI18N
            properties[PROPERTY_containerListeners] = new PropertyDescriptor ( "containerListeners", m1.pi.OkCancelDialog.class, "getContainerListeners", null ); // NOI18N
            properties[PROPERTY_cursor] = new PropertyDescriptor ( "cursor", m1.pi.OkCancelDialog.class, "getCursor", "setCursor" ); // NOI18N
            properties[PROPERTY_cursorSet] = new PropertyDescriptor ( "cursorSet", m1.pi.OkCancelDialog.class, "isCursorSet", null ); // NOI18N
            properties[PROPERTY_displayable] = new PropertyDescriptor ( "displayable", m1.pi.OkCancelDialog.class, "isDisplayable", null ); // NOI18N
            properties[PROPERTY_doubleBuffered] = new PropertyDescriptor ( "doubleBuffered", m1.pi.OkCancelDialog.class, "isDoubleBuffered", null ); // NOI18N
            properties[PROPERTY_dropTarget] = new PropertyDescriptor ( "dropTarget", m1.pi.OkCancelDialog.class, "getDropTarget", "setDropTarget" ); // NOI18N
            properties[PROPERTY_enabled] = new PropertyDescriptor ( "enabled", m1.pi.OkCancelDialog.class, "isEnabled", "setEnabled" ); // NOI18N
            properties[PROPERTY_focusable] = new PropertyDescriptor ( "focusable", m1.pi.OkCancelDialog.class, "isFocusable", "setFocusable" ); // NOI18N
            properties[PROPERTY_focusCycleRoot] = new PropertyDescriptor ( "focusCycleRoot", m1.pi.OkCancelDialog.class, "isFocusCycleRoot", "setFocusCycleRoot" ); // NOI18N
            properties[PROPERTY_focusCycleRootAncestor] = new PropertyDescriptor ( "focusCycleRootAncestor", m1.pi.OkCancelDialog.class, "getFocusCycleRootAncestor", null ); // NOI18N
            properties[PROPERTY_focusListeners] = new PropertyDescriptor ( "focusListeners", m1.pi.OkCancelDialog.class, "getFocusListeners", null ); // NOI18N
            properties[PROPERTY_focusOwner] = new PropertyDescriptor ( "focusOwner", m1.pi.OkCancelDialog.class, "isFocusOwner", null ); // NOI18N
            properties[PROPERTY_focusTraversable] = new PropertyDescriptor ( "focusTraversable", m1.pi.OkCancelDialog.class, "isFocusTraversable", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeys] = new IndexedPropertyDescriptor ( "focusTraversalKeys", m1.pi.OkCancelDialog.class, null, null, "getFocusTraversalKeys", null ); // NOI18N
            properties[PROPERTY_focusTraversalKeysEnabled] = new PropertyDescriptor ( "focusTraversalKeysEnabled", m1.pi.OkCancelDialog.class, "getFocusTraversalKeysEnabled", "setFocusTraversalKeysEnabled" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicy] = new PropertyDescriptor ( "focusTraversalPolicy", m1.pi.OkCancelDialog.class, "getFocusTraversalPolicy", "setFocusTraversalPolicy" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicyProvider] = new PropertyDescriptor ( "focusTraversalPolicyProvider", m1.pi.OkCancelDialog.class, "isFocusTraversalPolicyProvider", "setFocusTraversalPolicyProvider" ); // NOI18N
            properties[PROPERTY_focusTraversalPolicySet] = new PropertyDescriptor ( "focusTraversalPolicySet", m1.pi.OkCancelDialog.class, "isFocusTraversalPolicySet", null ); // NOI18N
            properties[PROPERTY_font] = new PropertyDescriptor ( "font", m1.pi.OkCancelDialog.class, "getFont", "setFont" ); // NOI18N
            properties[PROPERTY_fontSet] = new PropertyDescriptor ( "fontSet", m1.pi.OkCancelDialog.class, "isFontSet", null ); // NOI18N
            properties[PROPERTY_foreground] = new PropertyDescriptor ( "foreground", m1.pi.OkCancelDialog.class, "getForeground", "setForeground" ); // NOI18N
            properties[PROPERTY_foregroundSet] = new PropertyDescriptor ( "foregroundSet", m1.pi.OkCancelDialog.class, "isForegroundSet", null ); // NOI18N
            properties[PROPERTY_graphics] = new PropertyDescriptor ( "graphics", m1.pi.OkCancelDialog.class, "getGraphics", null ); // NOI18N
            properties[PROPERTY_graphicsConfiguration] = new PropertyDescriptor ( "graphicsConfiguration", m1.pi.OkCancelDialog.class, "getGraphicsConfiguration", null ); // NOI18N
            properties[PROPERTY_height] = new PropertyDescriptor ( "height", m1.pi.OkCancelDialog.class, "getHeight", null ); // NOI18N
            properties[PROPERTY_hierarchyBoundsListeners] = new PropertyDescriptor ( "hierarchyBoundsListeners", m1.pi.OkCancelDialog.class, "getHierarchyBoundsListeners", null ); // NOI18N
            properties[PROPERTY_hierarchyListeners] = new PropertyDescriptor ( "hierarchyListeners", m1.pi.OkCancelDialog.class, "getHierarchyListeners", null ); // NOI18N
            properties[PROPERTY_ignoreRepaint] = new PropertyDescriptor ( "ignoreRepaint", m1.pi.OkCancelDialog.class, "getIgnoreRepaint", "setIgnoreRepaint" ); // NOI18N
            properties[PROPERTY_inputContext] = new PropertyDescriptor ( "inputContext", m1.pi.OkCancelDialog.class, "getInputContext", null ); // NOI18N
            properties[PROPERTY_inputMethodListeners] = new PropertyDescriptor ( "inputMethodListeners", m1.pi.OkCancelDialog.class, "getInputMethodListeners", null ); // NOI18N
            properties[PROPERTY_inputMethodRequests] = new PropertyDescriptor ( "inputMethodRequests", m1.pi.OkCancelDialog.class, "getInputMethodRequests", null ); // NOI18N
            properties[PROPERTY_insets] = new PropertyDescriptor ( "insets", m1.pi.OkCancelDialog.class, "getInsets", null ); // NOI18N
            properties[PROPERTY_keyListeners] = new PropertyDescriptor ( "keyListeners", m1.pi.OkCancelDialog.class, "getKeyListeners", null ); // NOI18N
            properties[PROPERTY_layout] = new PropertyDescriptor ( "layout", m1.pi.OkCancelDialog.class, "getLayout", "setLayout" ); // NOI18N
            properties[PROPERTY_lightweight] = new PropertyDescriptor ( "lightweight", m1.pi.OkCancelDialog.class, "isLightweight", null ); // NOI18N
            properties[PROPERTY_locale] = new PropertyDescriptor ( "locale", m1.pi.OkCancelDialog.class, "getLocale", "setLocale" ); // NOI18N
            properties[PROPERTY_location] = new PropertyDescriptor ( "location", m1.pi.OkCancelDialog.class, "getLocation", "setLocation" ); // NOI18N
            properties[PROPERTY_locationOnScreen] = new PropertyDescriptor ( "locationOnScreen", m1.pi.OkCancelDialog.class, "getLocationOnScreen", null ); // NOI18N
            properties[PROPERTY_maximumSize] = new PropertyDescriptor ( "maximumSize", m1.pi.OkCancelDialog.class, "getMaximumSize", "setMaximumSize" ); // NOI18N
            properties[PROPERTY_maximumSizeSet] = new PropertyDescriptor ( "maximumSizeSet", m1.pi.OkCancelDialog.class, "isMaximumSizeSet", null ); // NOI18N
            properties[PROPERTY_minimumSize] = new PropertyDescriptor ( "minimumSize", m1.pi.OkCancelDialog.class, "getMinimumSize", "setMinimumSize" ); // NOI18N
            properties[PROPERTY_minimumSizeSet] = new PropertyDescriptor ( "minimumSizeSet", m1.pi.OkCancelDialog.class, "isMinimumSizeSet", null ); // NOI18N
            properties[PROPERTY_mouseListeners] = new PropertyDescriptor ( "mouseListeners", m1.pi.OkCancelDialog.class, "getMouseListeners", null ); // NOI18N
            properties[PROPERTY_mouseMotionListeners] = new PropertyDescriptor ( "mouseMotionListeners", m1.pi.OkCancelDialog.class, "getMouseMotionListeners", null ); // NOI18N
            properties[PROPERTY_mousePosition] = new PropertyDescriptor ( "mousePosition", m1.pi.OkCancelDialog.class, "getMousePosition", null ); // NOI18N
            properties[PROPERTY_mouseWheelListeners] = new PropertyDescriptor ( "mouseWheelListeners", m1.pi.OkCancelDialog.class, "getMouseWheelListeners", null ); // NOI18N
            properties[PROPERTY_name] = new PropertyDescriptor ( "name", m1.pi.OkCancelDialog.class, "getName", "setName" ); // NOI18N
            properties[PROPERTY_opaque] = new PropertyDescriptor ( "opaque", m1.pi.OkCancelDialog.class, "isOpaque", null ); // NOI18N
            properties[PROPERTY_parent] = new PropertyDescriptor ( "parent", m1.pi.OkCancelDialog.class, "getParent", null ); // NOI18N
            properties[PROPERTY_peer] = new PropertyDescriptor ( "peer", m1.pi.OkCancelDialog.class, "getPeer", null ); // NOI18N
            properties[PROPERTY_preferredSize] = new PropertyDescriptor ( "preferredSize", m1.pi.OkCancelDialog.class, "getPreferredSize", "setPreferredSize" ); // NOI18N
            properties[PROPERTY_preferredSizeSet] = new PropertyDescriptor ( "preferredSizeSet", m1.pi.OkCancelDialog.class, "isPreferredSizeSet", null ); // NOI18N
            properties[PROPERTY_propertyChangeListeners] = new PropertyDescriptor ( "propertyChangeListeners", m1.pi.OkCancelDialog.class, "getPropertyChangeListeners", null ); // NOI18N
            properties[PROPERTY_showing] = new PropertyDescriptor ( "showing", m1.pi.OkCancelDialog.class, "isShowing", null ); // NOI18N
            properties[PROPERTY_size] = new PropertyDescriptor ( "size", m1.pi.OkCancelDialog.class, "getSize", "setSize" ); // NOI18N
            properties[PROPERTY_toolkit] = new PropertyDescriptor ( "toolkit", m1.pi.OkCancelDialog.class, "getToolkit", null ); // NOI18N
            properties[PROPERTY_treeLock] = new PropertyDescriptor ( "treeLock", m1.pi.OkCancelDialog.class, "getTreeLock", null ); // NOI18N
            properties[PROPERTY_valid] = new PropertyDescriptor ( "valid", m1.pi.OkCancelDialog.class, "isValid", null ); // NOI18N
            properties[PROPERTY_validateRoot] = new PropertyDescriptor ( "validateRoot", m1.pi.OkCancelDialog.class, "isValidateRoot", null ); // NOI18N
            properties[PROPERTY_visible] = new PropertyDescriptor ( "visible", m1.pi.OkCancelDialog.class, "isVisible", "setVisible" ); // NOI18N
            properties[PROPERTY_width] = new PropertyDescriptor ( "width", m1.pi.OkCancelDialog.class, "getWidth", null ); // NOI18N
            properties[PROPERTY_x] = new PropertyDescriptor ( "x", m1.pi.OkCancelDialog.class, "getX", null ); // NOI18N
            properties[PROPERTY_y] = new PropertyDescriptor ( "y", m1.pi.OkCancelDialog.class, "getY", null ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Properties
    // Here you can add code for customizing the properties array.

        return properties;     }//GEN-LAST:Properties

    // EventSet identifiers//GEN-FIRST:Events
    private static final int EVENT_componentListener = 0;
    private static final int EVENT_containerListener = 1;
    private static final int EVENT_focusListener = 2;
    private static final int EVENT_hierarchyBoundsListener = 3;
    private static final int EVENT_hierarchyListener = 4;
    private static final int EVENT_inputMethodListener = 5;
    private static final int EVENT_keyListener = 6;
    private static final int EVENT_mouseListener = 7;
    private static final int EVENT_mouseMotionListener = 8;
    private static final int EVENT_mouseWheelListener = 9;
    private static final int EVENT_propertyChangeListener = 10;

    // EventSet array
    /*lazy EventSetDescriptor*/
    private static EventSetDescriptor[] getEdescriptor(){
        EventSetDescriptor[] eventSets = new EventSetDescriptor[11];
    
        try {
            eventSets[EVENT_componentListener] = new EventSetDescriptor ( m1.pi.OkCancelDialog.class, "componentListener", java.awt.event.ComponentListener.class, new String[] {"componentResized", "componentMoved", "componentShown", "componentHidden"}, "addComponentListener", "removeComponentListener" ); // NOI18N
            eventSets[EVENT_containerListener] = new EventSetDescriptor ( m1.pi.OkCancelDialog.class, "containerListener", java.awt.event.ContainerListener.class, new String[] {"componentAdded", "componentRemoved"}, "addContainerListener", "removeContainerListener" ); // NOI18N
            eventSets[EVENT_focusListener] = new EventSetDescriptor ( m1.pi.OkCancelDialog.class, "focusListener", java.awt.event.FocusListener.class, new String[] {"focusGained", "focusLost"}, "addFocusListener", "removeFocusListener" ); // NOI18N
            eventSets[EVENT_hierarchyBoundsListener] = new EventSetDescriptor ( m1.pi.OkCancelDialog.class, "hierarchyBoundsListener", java.awt.event.HierarchyBoundsListener.class, new String[] {"ancestorMoved", "ancestorResized"}, "addHierarchyBoundsListener", "removeHierarchyBoundsListener" ); // NOI18N
            eventSets[EVENT_hierarchyListener] = new EventSetDescriptor ( m1.pi.OkCancelDialog.class, "hierarchyListener", java.awt.event.HierarchyListener.class, new String[] {"hierarchyChanged"}, "addHierarchyListener", "removeHierarchyListener" ); // NOI18N
            eventSets[EVENT_inputMethodListener] = new EventSetDescriptor ( m1.pi.OkCancelDialog.class, "inputMethodListener", java.awt.event.InputMethodListener.class, new String[] {"inputMethodTextChanged", "caretPositionChanged"}, "addInputMethodListener", "removeInputMethodListener" ); // NOI18N
            eventSets[EVENT_keyListener] = new EventSetDescriptor ( m1.pi.OkCancelDialog.class, "keyListener", java.awt.event.KeyListener.class, new String[] {"keyTyped", "keyPressed", "keyReleased"}, "addKeyListener", "removeKeyListener" ); // NOI18N
            eventSets[EVENT_mouseListener] = new EventSetDescriptor ( m1.pi.OkCancelDialog.class, "mouseListener", java.awt.event.MouseListener.class, new String[] {"mouseClicked", "mousePressed", "mouseReleased", "mouseEntered", "mouseExited"}, "addMouseListener", "removeMouseListener" ); // NOI18N
            eventSets[EVENT_mouseMotionListener] = new EventSetDescriptor ( m1.pi.OkCancelDialog.class, "mouseMotionListener", java.awt.event.MouseMotionListener.class, new String[] {"mouseDragged", "mouseMoved"}, "addMouseMotionListener", "removeMouseMotionListener" ); // NOI18N
            eventSets[EVENT_mouseWheelListener] = new EventSetDescriptor ( m1.pi.OkCancelDialog.class, "mouseWheelListener", java.awt.event.MouseWheelListener.class, new String[] {"mouseWheelMoved"}, "addMouseWheelListener", "removeMouseWheelListener" ); // NOI18N
            eventSets[EVENT_propertyChangeListener] = new EventSetDescriptor ( m1.pi.OkCancelDialog.class, "propertyChangeListener", java.beans.PropertyChangeListener.class, new String[] {"propertyChange"}, "addPropertyChangeListener", "removePropertyChangeListener" ); // NOI18N
        }
        catch(IntrospectionException e) {
            e.printStackTrace();
        }//GEN-HEADEREND:Events
    // Here you can add code for customizing the event sets array.

        return eventSets;     }//GEN-LAST:Events

    // Method identifiers//GEN-FIRST:Methods
    private static final int METHOD_action0 = 0;
    private static final int METHOD_add1 = 1;
    private static final int METHOD_add2 = 2;
    private static final int METHOD_add3 = 3;
    private static final int METHOD_add4 = 4;
    private static final int METHOD_add5 = 5;
    private static final int METHOD_add6 = 6;
    private static final int METHOD_addNotify7 = 7;
    private static final int METHOD_addPropertyChangeListener8 = 8;
    private static final int METHOD_applyComponentOrientation9 = 9;
    private static final int METHOD_areFocusTraversalKeysSet10 = 10;
    private static final int METHOD_bounds11 = 11;
    private static final int METHOD_checkImage12 = 12;
    private static final int METHOD_checkImage13 = 13;
    private static final int METHOD_contains14 = 14;
    private static final int METHOD_contains15 = 15;
    private static final int METHOD_countComponents16 = 16;
    private static final int METHOD_createImage17 = 17;
    private static final int METHOD_createImage18 = 18;
    private static final int METHOD_createVolatileImage19 = 19;
    private static final int METHOD_createVolatileImage20 = 20;
    private static final int METHOD_deliverEvent21 = 21;
    private static final int METHOD_disable22 = 22;
    private static final int METHOD_dispatchEvent23 = 23;
    private static final int METHOD_doLayout24 = 24;
    private static final int METHOD_enable25 = 25;
    private static final int METHOD_enable26 = 26;
    private static final int METHOD_enableInputMethods27 = 27;
    private static final int METHOD_findComponentAt28 = 28;
    private static final int METHOD_findComponentAt29 = 29;
    private static final int METHOD_firePropertyChange30 = 30;
    private static final int METHOD_firePropertyChange31 = 31;
    private static final int METHOD_firePropertyChange32 = 32;
    private static final int METHOD_firePropertyChange33 = 33;
    private static final int METHOD_firePropertyChange34 = 34;
    private static final int METHOD_firePropertyChange35 = 35;
    private static final int METHOD_getBaseline36 = 36;
    private static final int METHOD_getBounds37 = 37;
    private static final int METHOD_getComponentAt38 = 38;
    private static final int METHOD_getComponentAt39 = 39;
    private static final int METHOD_getComponentZOrder40 = 40;
    private static final int METHOD_getFontMetrics41 = 41;
    private static final int METHOD_getListeners42 = 42;
    private static final int METHOD_getLocation43 = 43;
    private static final int METHOD_getMousePosition44 = 44;
    private static final int METHOD_getPropertyChangeListeners45 = 45;
    private static final int METHOD_getSize46 = 46;
    private static final int METHOD_gotFocus47 = 47;
    private static final int METHOD_handleEvent48 = 48;
    private static final int METHOD_hasFocus49 = 49;
    private static final int METHOD_hide50 = 50;
    private static final int METHOD_imageUpdate51 = 51;
    private static final int METHOD_insets52 = 52;
    private static final int METHOD_inside53 = 53;
    private static final int METHOD_invalidate54 = 54;
    private static final int METHOD_isAncestorOf55 = 55;
    private static final int METHOD_isFocusCycleRoot56 = 56;
    private static final int METHOD_keyDown57 = 57;
    private static final int METHOD_keyUp58 = 58;
    private static final int METHOD_layout59 = 59;
    private static final int METHOD_list60 = 60;
    private static final int METHOD_list61 = 61;
    private static final int METHOD_list62 = 62;
    private static final int METHOD_list63 = 63;
    private static final int METHOD_list64 = 64;
    private static final int METHOD_locate65 = 65;
    private static final int METHOD_location66 = 66;
    private static final int METHOD_lostFocus67 = 67;
    private static final int METHOD_main68 = 68;
    private static final int METHOD_minimumSize69 = 69;
    private static final int METHOD_mouseDown70 = 70;
    private static final int METHOD_mouseDrag71 = 71;
    private static final int METHOD_mouseEnter72 = 72;
    private static final int METHOD_mouseExit73 = 73;
    private static final int METHOD_mouseMove74 = 74;
    private static final int METHOD_mouseUp75 = 75;
    private static final int METHOD_move76 = 76;
    private static final int METHOD_nextFocus77 = 77;
    private static final int METHOD_paint78 = 78;
    private static final int METHOD_paintAll79 = 79;
    private static final int METHOD_paintComponents80 = 80;
    private static final int METHOD_postEvent81 = 81;
    private static final int METHOD_preferredSize82 = 82;
    private static final int METHOD_prepareImage83 = 83;
    private static final int METHOD_prepareImage84 = 84;
    private static final int METHOD_print85 = 85;
    private static final int METHOD_printAll86 = 86;
    private static final int METHOD_printComponents87 = 87;
    private static final int METHOD_remove88 = 88;
    private static final int METHOD_remove89 = 89;
    private static final int METHOD_remove90 = 90;
    private static final int METHOD_removeAll91 = 91;
    private static final int METHOD_removeNotify92 = 92;
    private static final int METHOD_removePropertyChangeListener93 = 93;
    private static final int METHOD_repaint94 = 94;
    private static final int METHOD_repaint95 = 95;
    private static final int METHOD_repaint96 = 96;
    private static final int METHOD_repaint97 = 97;
    private static final int METHOD_requestFocus98 = 98;
    private static final int METHOD_requestFocusInWindow99 = 99;
    private static final int METHOD_reshape100 = 100;
    private static final int METHOD_resize101 = 101;
    private static final int METHOD_resize102 = 102;
    private static final int METHOD_revalidate103 = 103;
    private static final int METHOD_setBounds104 = 104;
    private static final int METHOD_setComponentZOrder105 = 105;
    private static final int METHOD_setFocusTraversalKeys106 = 106;
    private static final int METHOD_show107 = 107;
    private static final int METHOD_show108 = 108;
    private static final int METHOD_size109 = 109;
    private static final int METHOD_toString110 = 110;
    private static final int METHOD_transferFocus111 = 111;
    private static final int METHOD_transferFocusBackward112 = 112;
    private static final int METHOD_transferFocusDownCycle113 = 113;
    private static final int METHOD_transferFocusUpCycle114 = 114;
    private static final int METHOD_update115 = 115;
    private static final int METHOD_validate116 = 116;

    // Method array 
    /*lazy MethodDescriptor*/
    private static MethodDescriptor[] getMdescriptor(){
        MethodDescriptor[] methods = new MethodDescriptor[117];
    
        try {
            methods[METHOD_action0] = new MethodDescriptor(java.awt.Component.class.getMethod("action", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_action0].setDisplayName ( "" );
            methods[METHOD_add1] = new MethodDescriptor(java.awt.Component.class.getMethod("add", new Class[] {java.awt.PopupMenu.class})); // NOI18N
            methods[METHOD_add1].setDisplayName ( "" );
            methods[METHOD_add2] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_add2].setDisplayName ( "" );
            methods[METHOD_add3] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.lang.String.class, java.awt.Component.class})); // NOI18N
            methods[METHOD_add3].setDisplayName ( "" );
            methods[METHOD_add4] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_add4].setDisplayName ( "" );
            methods[METHOD_add5] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_add5].setDisplayName ( "" );
            methods[METHOD_add6] = new MethodDescriptor(java.awt.Container.class.getMethod("add", new Class[] {java.awt.Component.class, java.lang.Object.class, int.class})); // NOI18N
            methods[METHOD_add6].setDisplayName ( "" );
            methods[METHOD_addNotify7] = new MethodDescriptor(java.awt.Container.class.getMethod("addNotify", new Class[] {})); // NOI18N
            methods[METHOD_addNotify7].setDisplayName ( "" );
            methods[METHOD_addPropertyChangeListener8] = new MethodDescriptor(java.awt.Container.class.getMethod("addPropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_addPropertyChangeListener8].setDisplayName ( "" );
            methods[METHOD_applyComponentOrientation9] = new MethodDescriptor(java.awt.Container.class.getMethod("applyComponentOrientation", new Class[] {java.awt.ComponentOrientation.class})); // NOI18N
            methods[METHOD_applyComponentOrientation9].setDisplayName ( "" );
            methods[METHOD_areFocusTraversalKeysSet10] = new MethodDescriptor(java.awt.Container.class.getMethod("areFocusTraversalKeysSet", new Class[] {int.class})); // NOI18N
            methods[METHOD_areFocusTraversalKeysSet10].setDisplayName ( "" );
            methods[METHOD_bounds11] = new MethodDescriptor(java.awt.Component.class.getMethod("bounds", new Class[] {})); // NOI18N
            methods[METHOD_bounds11].setDisplayName ( "" );
            methods[METHOD_checkImage12] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage12].setDisplayName ( "" );
            methods[METHOD_checkImage13] = new MethodDescriptor(java.awt.Component.class.getMethod("checkImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_checkImage13].setDisplayName ( "" );
            methods[METHOD_contains14] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_contains14].setDisplayName ( "" );
            methods[METHOD_contains15] = new MethodDescriptor(java.awt.Component.class.getMethod("contains", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_contains15].setDisplayName ( "" );
            methods[METHOD_countComponents16] = new MethodDescriptor(java.awt.Container.class.getMethod("countComponents", new Class[] {})); // NOI18N
            methods[METHOD_countComponents16].setDisplayName ( "" );
            methods[METHOD_createImage17] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {java.awt.image.ImageProducer.class})); // NOI18N
            methods[METHOD_createImage17].setDisplayName ( "" );
            methods[METHOD_createImage18] = new MethodDescriptor(java.awt.Component.class.getMethod("createImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createImage18].setDisplayName ( "" );
            methods[METHOD_createVolatileImage19] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_createVolatileImage19].setDisplayName ( "" );
            methods[METHOD_createVolatileImage20] = new MethodDescriptor(java.awt.Component.class.getMethod("createVolatileImage", new Class[] {int.class, int.class, java.awt.ImageCapabilities.class})); // NOI18N
            methods[METHOD_createVolatileImage20].setDisplayName ( "" );
            methods[METHOD_deliverEvent21] = new MethodDescriptor(java.awt.Container.class.getMethod("deliverEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_deliverEvent21].setDisplayName ( "" );
            methods[METHOD_disable22] = new MethodDescriptor(java.awt.Component.class.getMethod("disable", new Class[] {})); // NOI18N
            methods[METHOD_disable22].setDisplayName ( "" );
            methods[METHOD_dispatchEvent23] = new MethodDescriptor(java.awt.Component.class.getMethod("dispatchEvent", new Class[] {java.awt.AWTEvent.class})); // NOI18N
            methods[METHOD_dispatchEvent23].setDisplayName ( "" );
            methods[METHOD_doLayout24] = new MethodDescriptor(java.awt.Container.class.getMethod("doLayout", new Class[] {})); // NOI18N
            methods[METHOD_doLayout24].setDisplayName ( "" );
            methods[METHOD_enable25] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {})); // NOI18N
            methods[METHOD_enable25].setDisplayName ( "" );
            methods[METHOD_enable26] = new MethodDescriptor(java.awt.Component.class.getMethod("enable", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enable26].setDisplayName ( "" );
            methods[METHOD_enableInputMethods27] = new MethodDescriptor(java.awt.Component.class.getMethod("enableInputMethods", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_enableInputMethods27].setDisplayName ( "" );
            methods[METHOD_findComponentAt28] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_findComponentAt28].setDisplayName ( "" );
            methods[METHOD_findComponentAt29] = new MethodDescriptor(java.awt.Container.class.getMethod("findComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_findComponentAt29].setDisplayName ( "" );
            methods[METHOD_firePropertyChange30] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, byte.class, byte.class})); // NOI18N
            methods[METHOD_firePropertyChange30].setDisplayName ( "" );
            methods[METHOD_firePropertyChange31] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, char.class, char.class})); // NOI18N
            methods[METHOD_firePropertyChange31].setDisplayName ( "" );
            methods[METHOD_firePropertyChange32] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, short.class, short.class})); // NOI18N
            methods[METHOD_firePropertyChange32].setDisplayName ( "" );
            methods[METHOD_firePropertyChange33] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, long.class, long.class})); // NOI18N
            methods[METHOD_firePropertyChange33].setDisplayName ( "" );
            methods[METHOD_firePropertyChange34] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, float.class, float.class})); // NOI18N
            methods[METHOD_firePropertyChange34].setDisplayName ( "" );
            methods[METHOD_firePropertyChange35] = new MethodDescriptor(java.awt.Component.class.getMethod("firePropertyChange", new Class[] {java.lang.String.class, double.class, double.class})); // NOI18N
            methods[METHOD_firePropertyChange35].setDisplayName ( "" );
            methods[METHOD_getBaseline36] = new MethodDescriptor(java.awt.Component.class.getMethod("getBaseline", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getBaseline36].setDisplayName ( "" );
            methods[METHOD_getBounds37] = new MethodDescriptor(java.awt.Component.class.getMethod("getBounds", new Class[] {java.awt.Rectangle.class})); // NOI18N
            methods[METHOD_getBounds37].setDisplayName ( "" );
            methods[METHOD_getComponentAt38] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_getComponentAt38].setDisplayName ( "" );
            methods[METHOD_getComponentAt39] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentAt", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getComponentAt39].setDisplayName ( "" );
            methods[METHOD_getComponentZOrder40] = new MethodDescriptor(java.awt.Container.class.getMethod("getComponentZOrder", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_getComponentZOrder40].setDisplayName ( "" );
            methods[METHOD_getFontMetrics41] = new MethodDescriptor(java.awt.Component.class.getMethod("getFontMetrics", new Class[] {java.awt.Font.class})); // NOI18N
            methods[METHOD_getFontMetrics41].setDisplayName ( "" );
            methods[METHOD_getListeners42] = new MethodDescriptor(java.awt.Container.class.getMethod("getListeners", new Class[] {java.lang.Class.class})); // NOI18N
            methods[METHOD_getListeners42].setDisplayName ( "" );
            methods[METHOD_getLocation43] = new MethodDescriptor(java.awt.Component.class.getMethod("getLocation", new Class[] {java.awt.Point.class})); // NOI18N
            methods[METHOD_getLocation43].setDisplayName ( "" );
            methods[METHOD_getMousePosition44] = new MethodDescriptor(java.awt.Container.class.getMethod("getMousePosition", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_getMousePosition44].setDisplayName ( "" );
            methods[METHOD_getPropertyChangeListeners45] = new MethodDescriptor(java.awt.Component.class.getMethod("getPropertyChangeListeners", new Class[] {java.lang.String.class})); // NOI18N
            methods[METHOD_getPropertyChangeListeners45].setDisplayName ( "" );
            methods[METHOD_getSize46] = new MethodDescriptor(java.awt.Component.class.getMethod("getSize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_getSize46].setDisplayName ( "" );
            methods[METHOD_gotFocus47] = new MethodDescriptor(java.awt.Component.class.getMethod("gotFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_gotFocus47].setDisplayName ( "" );
            methods[METHOD_handleEvent48] = new MethodDescriptor(java.awt.Component.class.getMethod("handleEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_handleEvent48].setDisplayName ( "" );
            methods[METHOD_hasFocus49] = new MethodDescriptor(java.awt.Component.class.getMethod("hasFocus", new Class[] {})); // NOI18N
            methods[METHOD_hasFocus49].setDisplayName ( "" );
            methods[METHOD_hide50] = new MethodDescriptor(java.awt.Component.class.getMethod("hide", new Class[] {})); // NOI18N
            methods[METHOD_hide50].setDisplayName ( "" );
            methods[METHOD_imageUpdate51] = new MethodDescriptor(java.awt.Component.class.getMethod("imageUpdate", new Class[] {java.awt.Image.class, int.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_imageUpdate51].setDisplayName ( "" );
            methods[METHOD_insets52] = new MethodDescriptor(java.awt.Container.class.getMethod("insets", new Class[] {})); // NOI18N
            methods[METHOD_insets52].setDisplayName ( "" );
            methods[METHOD_inside53] = new MethodDescriptor(java.awt.Component.class.getMethod("inside", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_inside53].setDisplayName ( "" );
            methods[METHOD_invalidate54] = new MethodDescriptor(java.awt.Container.class.getMethod("invalidate", new Class[] {})); // NOI18N
            methods[METHOD_invalidate54].setDisplayName ( "" );
            methods[METHOD_isAncestorOf55] = new MethodDescriptor(java.awt.Container.class.getMethod("isAncestorOf", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_isAncestorOf55].setDisplayName ( "" );
            methods[METHOD_isFocusCycleRoot56] = new MethodDescriptor(java.awt.Container.class.getMethod("isFocusCycleRoot", new Class[] {java.awt.Container.class})); // NOI18N
            methods[METHOD_isFocusCycleRoot56].setDisplayName ( "" );
            methods[METHOD_keyDown57] = new MethodDescriptor(java.awt.Component.class.getMethod("keyDown", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyDown57].setDisplayName ( "" );
            methods[METHOD_keyUp58] = new MethodDescriptor(java.awt.Component.class.getMethod("keyUp", new Class[] {java.awt.Event.class, int.class})); // NOI18N
            methods[METHOD_keyUp58].setDisplayName ( "" );
            methods[METHOD_layout59] = new MethodDescriptor(java.awt.Container.class.getMethod("layout", new Class[] {})); // NOI18N
            methods[METHOD_layout59].setDisplayName ( "" );
            methods[METHOD_list60] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {})); // NOI18N
            methods[METHOD_list60].setDisplayName ( "" );
            methods[METHOD_list61] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintStream.class})); // NOI18N
            methods[METHOD_list61].setDisplayName ( "" );
            methods[METHOD_list62] = new MethodDescriptor(java.awt.Component.class.getMethod("list", new Class[] {java.io.PrintWriter.class})); // NOI18N
            methods[METHOD_list62].setDisplayName ( "" );
            methods[METHOD_list63] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintStream.class, int.class})); // NOI18N
            methods[METHOD_list63].setDisplayName ( "" );
            methods[METHOD_list64] = new MethodDescriptor(java.awt.Container.class.getMethod("list", new Class[] {java.io.PrintWriter.class, int.class})); // NOI18N
            methods[METHOD_list64].setDisplayName ( "" );
            methods[METHOD_locate65] = new MethodDescriptor(java.awt.Container.class.getMethod("locate", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_locate65].setDisplayName ( "" );
            methods[METHOD_location66] = new MethodDescriptor(java.awt.Component.class.getMethod("location", new Class[] {})); // NOI18N
            methods[METHOD_location66].setDisplayName ( "" );
            methods[METHOD_lostFocus67] = new MethodDescriptor(java.awt.Component.class.getMethod("lostFocus", new Class[] {java.awt.Event.class, java.lang.Object.class})); // NOI18N
            methods[METHOD_lostFocus67].setDisplayName ( "" );
            methods[METHOD_main68] = new MethodDescriptor(m1.pi.OkCancelDialog.class.getMethod("main", new Class[] {java.lang.String[].class})); // NOI18N
            methods[METHOD_main68].setDisplayName ( "" );
            methods[METHOD_minimumSize69] = new MethodDescriptor(java.awt.Container.class.getMethod("minimumSize", new Class[] {})); // NOI18N
            methods[METHOD_minimumSize69].setDisplayName ( "" );
            methods[METHOD_mouseDown70] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDown", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDown70].setDisplayName ( "" );
            methods[METHOD_mouseDrag71] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseDrag", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseDrag71].setDisplayName ( "" );
            methods[METHOD_mouseEnter72] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseEnter", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseEnter72].setDisplayName ( "" );
            methods[METHOD_mouseExit73] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseExit", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseExit73].setDisplayName ( "" );
            methods[METHOD_mouseMove74] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseMove", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseMove74].setDisplayName ( "" );
            methods[METHOD_mouseUp75] = new MethodDescriptor(java.awt.Component.class.getMethod("mouseUp", new Class[] {java.awt.Event.class, int.class, int.class})); // NOI18N
            methods[METHOD_mouseUp75].setDisplayName ( "" );
            methods[METHOD_move76] = new MethodDescriptor(java.awt.Component.class.getMethod("move", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_move76].setDisplayName ( "" );
            methods[METHOD_nextFocus77] = new MethodDescriptor(java.awt.Component.class.getMethod("nextFocus", new Class[] {})); // NOI18N
            methods[METHOD_nextFocus77].setDisplayName ( "" );
            methods[METHOD_paint78] = new MethodDescriptor(java.awt.Container.class.getMethod("paint", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paint78].setDisplayName ( "" );
            methods[METHOD_paintAll79] = new MethodDescriptor(java.awt.Component.class.getMethod("paintAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintAll79].setDisplayName ( "" );
            methods[METHOD_paintComponents80] = new MethodDescriptor(java.awt.Container.class.getMethod("paintComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_paintComponents80].setDisplayName ( "" );
            methods[METHOD_postEvent81] = new MethodDescriptor(java.awt.Component.class.getMethod("postEvent", new Class[] {java.awt.Event.class})); // NOI18N
            methods[METHOD_postEvent81].setDisplayName ( "" );
            methods[METHOD_preferredSize82] = new MethodDescriptor(java.awt.Container.class.getMethod("preferredSize", new Class[] {})); // NOI18N
            methods[METHOD_preferredSize82].setDisplayName ( "" );
            methods[METHOD_prepareImage83] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage83].setDisplayName ( "" );
            methods[METHOD_prepareImage84] = new MethodDescriptor(java.awt.Component.class.getMethod("prepareImage", new Class[] {java.awt.Image.class, int.class, int.class, java.awt.image.ImageObserver.class})); // NOI18N
            methods[METHOD_prepareImage84].setDisplayName ( "" );
            methods[METHOD_print85] = new MethodDescriptor(java.awt.Container.class.getMethod("print", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_print85].setDisplayName ( "" );
            methods[METHOD_printAll86] = new MethodDescriptor(java.awt.Component.class.getMethod("printAll", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printAll86].setDisplayName ( "" );
            methods[METHOD_printComponents87] = new MethodDescriptor(java.awt.Container.class.getMethod("printComponents", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_printComponents87].setDisplayName ( "" );
            methods[METHOD_remove88] = new MethodDescriptor(java.awt.Component.class.getMethod("remove", new Class[] {java.awt.MenuComponent.class})); // NOI18N
            methods[METHOD_remove88].setDisplayName ( "" );
            methods[METHOD_remove89] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {int.class})); // NOI18N
            methods[METHOD_remove89].setDisplayName ( "" );
            methods[METHOD_remove90] = new MethodDescriptor(java.awt.Container.class.getMethod("remove", new Class[] {java.awt.Component.class})); // NOI18N
            methods[METHOD_remove90].setDisplayName ( "" );
            methods[METHOD_removeAll91] = new MethodDescriptor(java.awt.Container.class.getMethod("removeAll", new Class[] {})); // NOI18N
            methods[METHOD_removeAll91].setDisplayName ( "" );
            methods[METHOD_removeNotify92] = new MethodDescriptor(java.awt.Container.class.getMethod("removeNotify", new Class[] {})); // NOI18N
            methods[METHOD_removeNotify92].setDisplayName ( "" );
            methods[METHOD_removePropertyChangeListener93] = new MethodDescriptor(java.awt.Component.class.getMethod("removePropertyChangeListener", new Class[] {java.lang.String.class, java.beans.PropertyChangeListener.class})); // NOI18N
            methods[METHOD_removePropertyChangeListener93].setDisplayName ( "" );
            methods[METHOD_repaint94] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {})); // NOI18N
            methods[METHOD_repaint94].setDisplayName ( "" );
            methods[METHOD_repaint95] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class})); // NOI18N
            methods[METHOD_repaint95].setDisplayName ( "" );
            methods[METHOD_repaint96] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint96].setDisplayName ( "" );
            methods[METHOD_repaint97] = new MethodDescriptor(java.awt.Component.class.getMethod("repaint", new Class[] {long.class, int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_repaint97].setDisplayName ( "" );
            methods[METHOD_requestFocus98] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocus", new Class[] {})); // NOI18N
            methods[METHOD_requestFocus98].setDisplayName ( "" );
            methods[METHOD_requestFocusInWindow99] = new MethodDescriptor(java.awt.Component.class.getMethod("requestFocusInWindow", new Class[] {})); // NOI18N
            methods[METHOD_requestFocusInWindow99].setDisplayName ( "" );
            methods[METHOD_reshape100] = new MethodDescriptor(java.awt.Component.class.getMethod("reshape", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_reshape100].setDisplayName ( "" );
            methods[METHOD_resize101] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {int.class, int.class})); // NOI18N
            methods[METHOD_resize101].setDisplayName ( "" );
            methods[METHOD_resize102] = new MethodDescriptor(java.awt.Component.class.getMethod("resize", new Class[] {java.awt.Dimension.class})); // NOI18N
            methods[METHOD_resize102].setDisplayName ( "" );
            methods[METHOD_revalidate103] = new MethodDescriptor(java.awt.Component.class.getMethod("revalidate", new Class[] {})); // NOI18N
            methods[METHOD_revalidate103].setDisplayName ( "" );
            methods[METHOD_setBounds104] = new MethodDescriptor(java.awt.Component.class.getMethod("setBounds", new Class[] {int.class, int.class, int.class, int.class})); // NOI18N
            methods[METHOD_setBounds104].setDisplayName ( "" );
            methods[METHOD_setComponentZOrder105] = new MethodDescriptor(java.awt.Container.class.getMethod("setComponentZOrder", new Class[] {java.awt.Component.class, int.class})); // NOI18N
            methods[METHOD_setComponentZOrder105].setDisplayName ( "" );
            methods[METHOD_setFocusTraversalKeys106] = new MethodDescriptor(java.awt.Container.class.getMethod("setFocusTraversalKeys", new Class[] {int.class, java.util.Set.class})); // NOI18N
            methods[METHOD_setFocusTraversalKeys106].setDisplayName ( "" );
            methods[METHOD_show107] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {})); // NOI18N
            methods[METHOD_show107].setDisplayName ( "" );
            methods[METHOD_show108] = new MethodDescriptor(java.awt.Component.class.getMethod("show", new Class[] {boolean.class})); // NOI18N
            methods[METHOD_show108].setDisplayName ( "" );
            methods[METHOD_size109] = new MethodDescriptor(java.awt.Component.class.getMethod("size", new Class[] {})); // NOI18N
            methods[METHOD_size109].setDisplayName ( "" );
            methods[METHOD_toString110] = new MethodDescriptor(java.awt.Component.class.getMethod("toString", new Class[] {})); // NOI18N
            methods[METHOD_toString110].setDisplayName ( "" );
            methods[METHOD_transferFocus111] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocus", new Class[] {})); // NOI18N
            methods[METHOD_transferFocus111].setDisplayName ( "" );
            methods[METHOD_transferFocusBackward112] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusBackward", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusBackward112].setDisplayName ( "" );
            methods[METHOD_transferFocusDownCycle113] = new MethodDescriptor(java.awt.Container.class.getMethod("transferFocusDownCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusDownCycle113].setDisplayName ( "" );
            methods[METHOD_transferFocusUpCycle114] = new MethodDescriptor(java.awt.Component.class.getMethod("transferFocusUpCycle", new Class[] {})); // NOI18N
            methods[METHOD_transferFocusUpCycle114].setDisplayName ( "" );
            methods[METHOD_update115] = new MethodDescriptor(java.awt.Container.class.getMethod("update", new Class[] {java.awt.Graphics.class})); // NOI18N
            methods[METHOD_update115].setDisplayName ( "" );
            methods[METHOD_validate116] = new MethodDescriptor(java.awt.Container.class.getMethod("validate", new Class[] {})); // NOI18N
            methods[METHOD_validate116].setDisplayName ( "" );
        }
        catch( Exception e) {}//GEN-HEADEREND:Methods
    // Here you can add code for customizing the methods array.

        return methods;     }//GEN-LAST:Methods

    private static java.awt.Image iconColor16 = null;//GEN-BEGIN:IconsDef
    private static java.awt.Image iconColor32 = null;
    private static java.awt.Image iconMono16 = null;
    private static java.awt.Image iconMono32 = null;//GEN-END:IconsDef
    private static String iconNameC16 = null;//GEN-BEGIN:Icons
    private static String iconNameC32 = null;
    private static String iconNameM16 = null;
    private static String iconNameM32 = null;//GEN-END:Icons

    private static final int defaultPropertyIndex = -1;//GEN-BEGIN:Idx
    private static final int defaultEventIndex = -1;//GEN-END:Idx


//GEN-FIRST:Superclass
    // Here you can add code for customizing the Superclass BeanInfo.

//GEN-LAST:Superclass
    /**
     * Gets the bean's <code>BeanDescriptor</code>s.
     *
     * @return BeanDescriptor describing the editable properties of this bean.
     * May return null if the information should be obtained by automatic
     * analysis.
     */
    @Override
    public BeanDescriptor getBeanDescriptor() {
        return getBdescriptor();
    }

    /**
     * Gets the bean's <code>PropertyDescriptor</code>s.
     *
     * @return An array of PropertyDescriptors describing the editable
     * properties supported by this bean. May return null if the information
     * should be obtained by automatic analysis.
     * <p>
     * If a property is indexed, then its entry in the result array will belong
     * to the IndexedPropertyDescriptor subclass of PropertyDescriptor. A client
     * of getPropertyDescriptors can use "instanceof" to check if a given
     * PropertyDescriptor is an IndexedPropertyDescriptor.
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        return getPdescriptor();
    }

    /**
     * Gets the bean's <code>EventSetDescriptor</code>s.
     *
     * @return An array of EventSetDescriptors describing the kinds of events
     * fired by this bean. May return null if the information should be obtained
     * by automatic analysis.
     */
    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        return getEdescriptor();
    }

    /**
     * Gets the bean's <code>MethodDescriptor</code>s.
     *
     * @return An array of MethodDescriptors describing the methods implemented
     * by this bean. May return null if the information should be obtained by
     * automatic analysis.
     */
    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        return getMdescriptor();
    }

    /**
     * A bean may have a "default" property that is the property that will
     * mostly commonly be initially chosen for update by human's who are
     * customizing the bean.
     *
     * @return Index of default property in the PropertyDescriptor array
     * returned by getPropertyDescriptors.
     * <P>
     * Returns -1 if there is no default property.
     */
    @Override
    public int getDefaultPropertyIndex() {
        return defaultPropertyIndex;
    }

    /**
     * A bean may have a "default" event that is the event that will mostly
     * commonly be used by human's when using the bean.
     *
     * @return Index of default event in the EventSetDescriptor array returned
     * by getEventSetDescriptors.
     * <P>
     * Returns -1 if there is no default event.
     */
    @Override
    public int getDefaultEventIndex() {
        return defaultEventIndex;
    }

    /**
     * This method returns an image object that can be used to represent the
     * bean in toolboxes, toolbars, etc. Icon images will typically be GIFs, but
     * may in future include other formats.
     * <p>
     * Beans aren't required to provide icons and may return null from this
     * method.
     * <p>
     * There are four possible flavors of icons (16x16 color, 32x32 color, 16x16
     * mono, 32x32 mono). If a bean choses to only support a single icon we
     * recommend supporting 16x16 color.
     * <p>
     * We recommend that icons have a "transparent" background so they can be
     * rendered onto an existing background.
     *
     * @param iconKind The kind of icon requested. This should be one of the
     * constant values ICON_COLOR_16x16, ICON_COLOR_32x32, ICON_MONO_16x16, or
     * ICON_MONO_32x32.
     * @return An image object representing the requested icon. May return null
     * if no suitable icon is available.
     */
    @Override
    public java.awt.Image getIcon(int iconKind) {
        switch (iconKind) {
            case ICON_COLOR_16x16:
                if (iconNameC16 == null) {
                    return null;
                } else {
                    if (iconColor16 == null) {
                        iconColor16 = loadImage(iconNameC16);
                    }
                    return iconColor16;
                }
            case ICON_COLOR_32x32:
                if (iconNameC32 == null) {
                    return null;
                } else {
                    if (iconColor32 == null) {
                        iconColor32 = loadImage(iconNameC32);
                    }
                    return iconColor32;
                }
            case ICON_MONO_16x16:
                if (iconNameM16 == null) {
                    return null;
                } else {
                    if (iconMono16 == null) {
                        iconMono16 = loadImage(iconNameM16);
                    }
                    return iconMono16;
                }
            case ICON_MONO_32x32:
                if (iconNameM32 == null) {
                    return null;
                } else {
                    if (iconMono32 == null) {
                        iconMono32 = loadImage(iconNameM32);
                    }
                    return iconMono32;
                }
            default:
                return null;
        }
    }
    
}
