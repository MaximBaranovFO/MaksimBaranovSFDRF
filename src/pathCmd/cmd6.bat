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

PowerShell -Command "Get-Content c:\_bmv\13cmdLearn\pre\html\epigraph.html >> C:\_bmv\13cmdLearn\output\%_my_datetime%_outJavaToHtml\%_my_datetime%_content_java_Concurrent.html"

PowerShell -Command "Get-Item c:\_bmv\13cmdLearn\input\20220313\* -Force -include *.java | Get-Content >> C:\_bmv\13cmdLearn\output\%_my_datetime%_outJavaToHtml\%_my_datetime%_content_java_Concurrent.html"

PowerShell -Command "Get-Content c:\_bmv\13cmdLearn\post\html\postpage.html >> C:\_bmv\13cmdLearn\output\%_my_datetime%_outJavaToHtml\%_my_datetime%_content_java_Concurrent.html"

