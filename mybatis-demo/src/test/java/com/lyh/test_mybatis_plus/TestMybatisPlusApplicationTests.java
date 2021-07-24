package com.lyh.test_mybatis_plus;


import com.lyh.test_mybatis_plus.dp.People;
import mapper.AnimalMapper;
import mapper.CityMapper;
import mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestMybatisPlusApplicationTests {
    @Resource
    UserMapper userMapper;
    @Resource
    CityMapper cityMapper;
    @Resource
    AnimalMapper animalMapper;

    @Resource(name = "bob_nb")
    People people1;

    @Resource(name = "tom_nb")
    People people2;


    @Test
    public void testSelect() {
        int j = 0;
        for (int i = 0;i < 20;++i){
            j += i;
            System.out.println(j);
        }
        System.out.println(j);
//        System.out.println("11111111");
//        List<User> userList = userMapper.selectList(null);
//        for (User user : userList) {
//            System.out.println(user);
//        }
//        Bob bob = new Bob();
//        bob.run();
//        try {

//        System.out.println("=======");
//        people1.run();
//        System.out.println("=======");
//        people2.run();

//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        User user = new User();
//        user.setName("wq");
//        user.setAge(20);
//        user.setEmail("wq@163.com");
//        userMapper.update(user,new QueryWrapper<User>()
//        .eq("name","wlm")
//        .eq("age",20));

//        List<User> userList1 = userMapper.selectList(new UpdateWrapper<User>()
//        .between("age",20,21)
//        .orderByAsc("age")
//        .last("limit 5"));
//        userMapper.selectList(null).forEach(System.out::println);
//        System.out.println("=========");
//        for(User user : userList1){
//            System.out.println(user);
//        }

//        List<City> cityList = cityMapper.selectList(null);
//        for(City city:cityList) {
//            System.out.println(city);
//        }
//        List<Animal> animalList = animalMapper.selectList(null);
//        for(int i = 0;i < animalList.size();++i){
//            System.out.println(animalList.get(i));
//        }
    }
}

