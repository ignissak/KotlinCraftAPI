<p align="center">
<img alt="GitHub top language" src="https://img.shields.io/github/languages/top/ignissak/KotlinCraftAPI?style=for-the-badge">
</p>

<h1 align="center"> KotlinCraftAPI </h1>


This project is Spring & Kotlin equivalent to original [CraftMania's TypeScript CraftAPI](https://github.com/craftmania-cz/craftapi). 
This project was created solely to study Spring and to have a relevant code example. 

**Also, this project will not run unless you are connected to correct database. Experienced developers will be able to replicate correct database structure, but it is not provided for public.** 

## Running

You need to configure your database settings in `src/main/resources/application.properties`.

```
git clone https://github.com/ignissak/KotlinCraftAPI.git
./gradlew clean build
```

Then you can run the application using `./gradlew bootRun` or `java -jar build/libs/compiled_file_name.jar`.

## Endpoints

To view all available endpoints click [here](ENDPOINTS.md).