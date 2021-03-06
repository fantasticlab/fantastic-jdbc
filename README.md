# Fantastic-JDBC

[![Build Status](https://travis-ci.org/fantasticlab/fantastic-jdbc.svg?branch=master)](https://travis-ci.org/fantasticlab/fantastic-jdbc)
![JDK](https://img.shields.io/badge/jdk-openjdk8-9cf)
![GitHub](https://img.shields.io/github/license/fantasticlab/fantastic-jdbc)

`Fantastic-JDBC` is a simplified ORM for learning, which is based on `MyBatis`.

## Architecture

`Fantastic-JDBC` contains most of modules in `MyBatis`, such as

* Configuration
    * MapperRegistry
    * UnpooledDataSource
    * mappedStatements
    * SqlSource(Dynamic/Raw/Static)
    
* Builder
    * XMLConfigBuilder
    * XMLMapperBuilder
    * XMLStatementBuilder
    * XMLScriptBuilder
    
* SqlSession
    * Executor
    * StatementHandler
    
## Example

```java
SqlSessionFactory factory = SqlSessionFactoryBuilder.build("JdbcConfig.xml");
SqlSession sqlSession = factory.openSession(false);

UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
assert userMapper != null;

userMapper.getUser(1l);

User user = new User();
user.setName("Jack");
Long id = userMapper.insert(user);
assert id != null;

user = userMapper.getUser(id);
assert user != null;

List<User> users = userMapper.getAll();
assert users != null;
```
