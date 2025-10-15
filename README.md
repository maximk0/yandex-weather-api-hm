# yandex-weather-api-hm
Практическое задание по джава

ТЗ:
Сделайте GET запрос используя путь: https://api.weather.yandex.ru/v2/forecast.
Передайте координаты точки lat и lon, в которой хотите определить погоду, например: https://api.weather.yandex.ru/v2/forecast?lat=55.75&lon=37.62.
Выведите на экран все данные (весь ответ от сервиса в формате json) и отдельно температуру (находится в fact {temp}).
Вычислите среднюю температуру по прогнозу: используйте параметр limit как количество суток и возьмите из ответа поля forecasts[*].parts.day.temp_avg за эти сутки; затем посчитайте их среднее арифметическое. Отдельно выведите текущую температуру из fact.temp.
Описание API https://yandex.ru/dev/weather/doc/ru/concepts/forecast-info
