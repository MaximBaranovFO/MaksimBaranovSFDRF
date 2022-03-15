set _my_datetime=%date%_%time%
set _my_datetime=%_my_datetime: =_%
set _my_datetime=%_my_datetime::=%
set _my_datetime=%_my_datetime:/=_%
set _my_datetime=%_my_datetime:.=_%
set _my_datetime=%_my_datetime:,=_%

cd C:\_bmv\13cmdLearn\output\
mkdir %_my_datetime%_outJavaToHtml
cd %_my_datetime%_outJavaToHtml
mkdir files
cd files
REM copy c:\_bmv\13cmdLearn\JavaScript\*.* *.*
PowerShell -Command "Copy-Item -Path c:\_bmv\13cmdLearn\JavaScript -Destination C:\_bmv\13cmdLearn\output\%_my_datetime%_outJavaToHtml -Force -Recurse"
cd ..
cd C:\_bmv\13cmdLearn\

PowerShell -Command "Get-Content c:\_bmv\13cmdLearn\pre\html\epigraph.html >> C:\_bmv\13cmdLearn\output\%_my_datetime%_outJavaToHtml\%_my_datetime%_content_java_jdk_src.html"

PowerShell -Command "Get-ChildItem -Force -Recurse C:\'Program Files'\Java\jdk-17.0.2\lib\src\* | convertto-html >> C:\_bmv\13cmdLearn\output\%_my_datetime%_outJavaToHtml\%_my_datetime%_content_java_jdk_src.html"


PowerShell -Command "Get-Content c:\_bmv\13cmdLearn\post\html\postpage.html >> C:\_bmv\13cmdLearn\output\%_my_datetime%_outJavaToHtml\%_my_datetime%_content_java_jdk_src.html"