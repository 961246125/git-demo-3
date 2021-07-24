package entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "animals")
public class Animal {
    @TableId(value = "animal_id",type = IdType.AUTO)
    private int AnimalIds;
    private String AnimalName;
    private String AnimalHigh;
}
