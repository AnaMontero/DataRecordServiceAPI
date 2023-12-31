# DataRecordServiceAPI

The Data Record Service API is an application that provides users access to data records on a remote server. <br>
It presents users with data records chronologically in a paged fashion, allowing them to view records in a manageable way.

## Author
- [Ana Montero](https://github.com/AnaMontero)

***

## Index:
- [Technology stack](#technology-stack)
- [Usage](#usage)
- [Installation](#installation)
- [API Routes](#api-routes)
- [Body example](#body-example)

***

## Technology stack

#### Environment
<li>IntelliJ IDEA 2022.2.4 (Ultimate Edition)</li>
<li>Java 17</li>
<li>Maven 3.8.6</li>
<li>Postman</li>

#### API framework
<li>Java Spring Web</li>

#### Testing framework
<li>AssertJ</li>

#### Other frameworks
<li>Lombok</li>

## Usage
The Data Record Service API allows users to filter data records based on a specific date range.<br>
By providing a date range along with page and results per page settings,
users can efficiently retrieve and view relevant data records based on their selected criteria.

- **Start Date**: Enter the start date of the desired date range.
- **End Date**: Enter the end date of the desired date range.
- **Page Number**: Specify the page number to view specific pages of data.
- **Results Per Page**: Optionally, set the number of results to display per page.

- The main function is `getRecordsByDate`, which retrieves data records based on the specified date range, page number, and results per page.
- The `getRemoteRecords` function handles the remote server lookup and data retrieval.

## Installation
To use the Data Record Service API, follow these steps:

1. Clone the repository from [GitHub](https://github.com/AnaMontero/DataRecordServiceAPI).
2. Set up the required dependencies.
3. Run the application and start using the API to retrieve data records.

## API Routes

| Method | Route                      | Description                                                                                                                    |
|--------|----------------------------|--------------------------------------------------------------------------------------------------------------------------------|
| GET    | /data-records              | Returns a list of data records by dates, in a pagination way. Number page and records per page can be indicated. Requires body |

## Body example
`{` <br>
`"startDate": "2021-05-01",` <br>
`"endDate": "2022-05-01",` <br>
`"pageNumber": 2,` <br>
`"resultsPerPage": 2` <br>
`}` <br>