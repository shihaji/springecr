FROM public.ecr.aws/bitnami/java:17
ADD target/springecr.jar springecr.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","springecr.jar"]