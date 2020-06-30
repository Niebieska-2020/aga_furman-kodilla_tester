del /S build\libs\*.jar

gradlew build

if exist build\libs\*.jar (
    for /R build\libs %%f in (*.jar) do copy %%f C:\project\
) else (
    echo "File does not exist. Compilation error."
)
