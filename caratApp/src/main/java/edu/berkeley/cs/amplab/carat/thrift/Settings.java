/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.berkeley.cs.amplab.carat.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-3-31")
public class Settings implements org.apache.thrift.TBase<Settings, Settings._Fields>, java.io.Serializable, Cloneable, Comparable<Settings> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Settings");

  private static final org.apache.thrift.protocol.TField BLUETOOTH_ENABLED_FIELD_DESC = new org.apache.thrift.protocol.TField("bluetoothEnabled", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField LOCATION_ENABLED_FIELD_DESC = new org.apache.thrift.protocol.TField("locationEnabled", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField POWERSAVER_ENABLED_FIELD_DESC = new org.apache.thrift.protocol.TField("powersaverEnabled", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SettingsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SettingsTupleSchemeFactory());
  }

  public boolean bluetoothEnabled; // optional
  public boolean locationEnabled; // optional
  public boolean powersaverEnabled; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BLUETOOTH_ENABLED((short)1, "bluetoothEnabled"),
    LOCATION_ENABLED((short)2, "locationEnabled"),
    POWERSAVER_ENABLED((short)3, "powersaverEnabled");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BLUETOOTH_ENABLED
          return BLUETOOTH_ENABLED;
        case 2: // LOCATION_ENABLED
          return LOCATION_ENABLED;
        case 3: // POWERSAVER_ENABLED
          return POWERSAVER_ENABLED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __BLUETOOTHENABLED_ISSET_ID = 0;
  private static final int __LOCATIONENABLED_ISSET_ID = 1;
  private static final int __POWERSAVERENABLED_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.BLUETOOTH_ENABLED,_Fields.LOCATION_ENABLED,_Fields.POWERSAVER_ENABLED};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BLUETOOTH_ENABLED, new org.apache.thrift.meta_data.FieldMetaData("bluetoothEnabled", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.LOCATION_ENABLED, new org.apache.thrift.meta_data.FieldMetaData("locationEnabled", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.POWERSAVER_ENABLED, new org.apache.thrift.meta_data.FieldMetaData("powersaverEnabled", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Settings.class, metaDataMap);
  }

  public Settings() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Settings(Settings other) {
    __isset_bitfield = other.__isset_bitfield;
    this.bluetoothEnabled = other.bluetoothEnabled;
    this.locationEnabled = other.locationEnabled;
    this.powersaverEnabled = other.powersaverEnabled;
  }

  public Settings deepCopy() {
    return new Settings(this);
  }

  @Override
  public void clear() {
    setBluetoothEnabledIsSet(false);
    this.bluetoothEnabled = false;
    setLocationEnabledIsSet(false);
    this.locationEnabled = false;
    setPowersaverEnabledIsSet(false);
    this.powersaverEnabled = false;
  }

  public boolean isBluetoothEnabled() {
    return this.bluetoothEnabled;
  }

  public Settings setBluetoothEnabled(boolean bluetoothEnabled) {
    this.bluetoothEnabled = bluetoothEnabled;
    setBluetoothEnabledIsSet(true);
    return this;
  }

  public void unsetBluetoothEnabled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BLUETOOTHENABLED_ISSET_ID);
  }

  /** Returns true if field bluetoothEnabled is set (has been assigned a value) and false otherwise */
  public boolean isSetBluetoothEnabled() {
    return EncodingUtils.testBit(__isset_bitfield, __BLUETOOTHENABLED_ISSET_ID);
  }

  public void setBluetoothEnabledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BLUETOOTHENABLED_ISSET_ID, value);
  }

  public boolean isLocationEnabled() {
    return this.locationEnabled;
  }

  public Settings setLocationEnabled(boolean locationEnabled) {
    this.locationEnabled = locationEnabled;
    setLocationEnabledIsSet(true);
    return this;
  }

  public void unsetLocationEnabled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOCATIONENABLED_ISSET_ID);
  }

  /** Returns true if field locationEnabled is set (has been assigned a value) and false otherwise */
  public boolean isSetLocationEnabled() {
    return EncodingUtils.testBit(__isset_bitfield, __LOCATIONENABLED_ISSET_ID);
  }

  public void setLocationEnabledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOCATIONENABLED_ISSET_ID, value);
  }

  public boolean isPowersaverEnabled() {
    return this.powersaverEnabled;
  }

  public Settings setPowersaverEnabled(boolean powersaverEnabled) {
    this.powersaverEnabled = powersaverEnabled;
    setPowersaverEnabledIsSet(true);
    return this;
  }

  public void unsetPowersaverEnabled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __POWERSAVERENABLED_ISSET_ID);
  }

  /** Returns true if field powersaverEnabled is set (has been assigned a value) and false otherwise */
  public boolean isSetPowersaverEnabled() {
    return EncodingUtils.testBit(__isset_bitfield, __POWERSAVERENABLED_ISSET_ID);
  }

  public void setPowersaverEnabledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __POWERSAVERENABLED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BLUETOOTH_ENABLED:
      if (value == null) {
        unsetBluetoothEnabled();
      } else {
        setBluetoothEnabled((Boolean)value);
      }
      break;

    case LOCATION_ENABLED:
      if (value == null) {
        unsetLocationEnabled();
      } else {
        setLocationEnabled((Boolean)value);
      }
      break;

    case POWERSAVER_ENABLED:
      if (value == null) {
        unsetPowersaverEnabled();
      } else {
        setPowersaverEnabled((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BLUETOOTH_ENABLED:
      return Boolean.valueOf(isBluetoothEnabled());

    case LOCATION_ENABLED:
      return Boolean.valueOf(isLocationEnabled());

    case POWERSAVER_ENABLED:
      return Boolean.valueOf(isPowersaverEnabled());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BLUETOOTH_ENABLED:
      return isSetBluetoothEnabled();
    case LOCATION_ENABLED:
      return isSetLocationEnabled();
    case POWERSAVER_ENABLED:
      return isSetPowersaverEnabled();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Settings)
      return this.equals((Settings)that);
    return false;
  }

  public boolean equals(Settings that) {
    if (that == null)
      return false;

    boolean this_present_bluetoothEnabled = true && this.isSetBluetoothEnabled();
    boolean that_present_bluetoothEnabled = true && that.isSetBluetoothEnabled();
    if (this_present_bluetoothEnabled || that_present_bluetoothEnabled) {
      if (!(this_present_bluetoothEnabled && that_present_bluetoothEnabled))
        return false;
      if (this.bluetoothEnabled != that.bluetoothEnabled)
        return false;
    }

    boolean this_present_locationEnabled = true && this.isSetLocationEnabled();
    boolean that_present_locationEnabled = true && that.isSetLocationEnabled();
    if (this_present_locationEnabled || that_present_locationEnabled) {
      if (!(this_present_locationEnabled && that_present_locationEnabled))
        return false;
      if (this.locationEnabled != that.locationEnabled)
        return false;
    }

    boolean this_present_powersaverEnabled = true && this.isSetPowersaverEnabled();
    boolean that_present_powersaverEnabled = true && that.isSetPowersaverEnabled();
    if (this_present_powersaverEnabled || that_present_powersaverEnabled) {
      if (!(this_present_powersaverEnabled && that_present_powersaverEnabled))
        return false;
      if (this.powersaverEnabled != that.powersaverEnabled)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_bluetoothEnabled = true && (isSetBluetoothEnabled());
    list.add(present_bluetoothEnabled);
    if (present_bluetoothEnabled)
      list.add(bluetoothEnabled);

    boolean present_locationEnabled = true && (isSetLocationEnabled());
    list.add(present_locationEnabled);
    if (present_locationEnabled)
      list.add(locationEnabled);

    boolean present_powersaverEnabled = true && (isSetPowersaverEnabled());
    list.add(present_powersaverEnabled);
    if (present_powersaverEnabled)
      list.add(powersaverEnabled);

    return list.hashCode();
  }

  @Override
  public int compareTo(Settings other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBluetoothEnabled()).compareTo(other.isSetBluetoothEnabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBluetoothEnabled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bluetoothEnabled, other.bluetoothEnabled);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocationEnabled()).compareTo(other.isSetLocationEnabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocationEnabled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locationEnabled, other.locationEnabled);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPowersaverEnabled()).compareTo(other.isSetPowersaverEnabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPowersaverEnabled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.powersaverEnabled, other.powersaverEnabled);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Settings(");
    boolean first = true;

    if (isSetBluetoothEnabled()) {
      sb.append("bluetoothEnabled:");
      sb.append(this.bluetoothEnabled);
      first = false;
    }
    if (isSetLocationEnabled()) {
      if (!first) sb.append(", ");
      sb.append("locationEnabled:");
      sb.append(this.locationEnabled);
      first = false;
    }
    if (isSetPowersaverEnabled()) {
      if (!first) sb.append(", ");
      sb.append("powersaverEnabled:");
      sb.append(this.powersaverEnabled);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SettingsStandardSchemeFactory implements SchemeFactory {
    public SettingsStandardScheme getScheme() {
      return new SettingsStandardScheme();
    }
  }

  private static class SettingsStandardScheme extends StandardScheme<Settings> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Settings struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BLUETOOTH_ENABLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.bluetoothEnabled = iprot.readBool();
              struct.setBluetoothEnabledIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCATION_ENABLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.locationEnabled = iprot.readBool();
              struct.setLocationEnabledIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POWERSAVER_ENABLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.powersaverEnabled = iprot.readBool();
              struct.setPowersaverEnabledIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Settings struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetBluetoothEnabled()) {
        oprot.writeFieldBegin(BLUETOOTH_ENABLED_FIELD_DESC);
        oprot.writeBool(struct.bluetoothEnabled);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLocationEnabled()) {
        oprot.writeFieldBegin(LOCATION_ENABLED_FIELD_DESC);
        oprot.writeBool(struct.locationEnabled);
        oprot.writeFieldEnd();
      }
      if (struct.isSetPowersaverEnabled()) {
        oprot.writeFieldBegin(POWERSAVER_ENABLED_FIELD_DESC);
        oprot.writeBool(struct.powersaverEnabled);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SettingsTupleSchemeFactory implements SchemeFactory {
    public SettingsTupleScheme getScheme() {
      return new SettingsTupleScheme();
    }
  }

  private static class SettingsTupleScheme extends TupleScheme<Settings> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Settings struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBluetoothEnabled()) {
        optionals.set(0);
      }
      if (struct.isSetLocationEnabled()) {
        optionals.set(1);
      }
      if (struct.isSetPowersaverEnabled()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetBluetoothEnabled()) {
        oprot.writeBool(struct.bluetoothEnabled);
      }
      if (struct.isSetLocationEnabled()) {
        oprot.writeBool(struct.locationEnabled);
      }
      if (struct.isSetPowersaverEnabled()) {
        oprot.writeBool(struct.powersaverEnabled);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Settings struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.bluetoothEnabled = iprot.readBool();
        struct.setBluetoothEnabledIsSet(true);
      }
      if (incoming.get(1)) {
        struct.locationEnabled = iprot.readBool();
        struct.setLocationEnabledIsSet(true);
      }
      if (incoming.get(2)) {
        struct.powersaverEnabled = iprot.readBool();
        struct.setPowersaverEnabledIsSet(true);
      }
    }
  }

}

