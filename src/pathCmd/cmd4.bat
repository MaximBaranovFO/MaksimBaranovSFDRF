set _my_datetime=%date%_%time%
set _my_datetime=%_my_datetime: =_%
set _my_datetime=%_my_datetime::=%
set _my_datetime=%_my_datetime:/=_%
set _my_datetime=%_my_datetime:.=_%
set _my_datetime=%_my_datetime:,=_%

cd C:\_bmv\13cmdLearn\output\
mkdir %_my_datetime%_17JavaLearn
cd C:\_bmv\13cmdLearn\

PowerShell -Command "Get-ChildItem -Force -Recurse C:\_bmv\17JavaLearn\java_17_0_2_src\* | convertto-html > C:\_bmv\13cmdLearn\output\%_my_datetime%_17JavaLearn\%_my_datetime%_content_jdk-17_0_2_lib_src.html"