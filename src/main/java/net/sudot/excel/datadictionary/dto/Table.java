package net.sudot.excel.datadictionary.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * 表格信息
 *
 * @author tangjialin on 2019-03-01.
 */
@Getter
@Setter
@Accessors(chain = true)
public class Table {
    /** 表名 */
    private String name;
    /** 表注释 */
    private String comment;
}
