package app.photofox.vipsffm.enums;

import app.photofox.vipsffm.VNamedEnum;
import java.lang.Override;
import java.lang.String;

/**
 * <p>How many pyramid layers to create.</p>
 */
public enum VipsForeignDzContainer implements VNamedEnum {
  /**
   * <p>write tiles to the filesystem</p>
   */
  FOREIGN_DZ_CONTAINER_FS("VIPS_FOREIGN_DZ_CONTAINER_FS", "fs", 0),

  /**
   * <p>write tiles to a zip file</p>
   */
  FOREIGN_DZ_CONTAINER_ZIP("VIPS_FOREIGN_DZ_CONTAINER_ZIP", "zip", 1),

  /**
   * <p>write to a szi file</p>
   */
  FOREIGN_DZ_CONTAINER_SZI("VIPS_FOREIGN_DZ_CONTAINER_SZI", "szi", 2),

  FOREIGN_DZ_CONTAINER_LAST("VIPS_FOREIGN_DZ_CONTAINER_LAST", "last", 3);

  public static final String parentName = "VipsForeignDzContainer";

  private final String vipsName;

  private final String vipsNickname;

  private final int rawValue;

  VipsForeignDzContainer(String vipsName, String vipsNickname, int rawValue) {
    this.vipsName = vipsName;
    this.vipsNickname = vipsNickname;
    this.rawValue = rawValue;
  }

  @Override
  public String getName() {
    return this.vipsName;
  }

  @Override
  public String getNickname() {
    return this.vipsNickname;
  }

  @Override
  public int getRawValue() {
    return this.rawValue;
  }
}
