<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Crypto Portal</title>
    <link rel="stylesheet" href="./resource/bootstrap.min.css">

</head>
<style>

    .progress-bar {
        animation: mybar 3s infinite;
        animation-play-state: running;
    }

    .progress-bar:hover {
        animation-play-state: paused;
    }
    @keyframes mybar {
        from {
            width: 0%;
        }

        to {
            width: 100%;
        }

    }


    .bk-image {
        background-color: #e2ebf0;
    }
</style>

<body class="bk-image">
    <div style="z-index:9999999999; left: 77%; position: fixed; margin-top:100px; ; margin-bottom:0;" id="toast">
        <div class="toast card text-white bg-success" role="alert" aria-live="assertive" aria-atomic="true"
            style="display: none;">
            <div class="card-header">
                <strong class="me-auto">Success</strong>
            </div>
            <div class="toast-body toast-success">
            </div>
            <div class="progress">
                <div class="progress-bar progress-bar-striped progress-bar-animated bg-success" role="progressbar"
                    aria-valuenow="75" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>
            </div>
        </div>
        <div class="toast card text-white bg-danger" role="alert" aria-live="assertive" aria-atomic="true"
            style="display: none;">
            <div class="card-header">
                <strong class="me-auto">Error</strong>
            </div>
            <div class="toast-body toast-error">
            </div>
            <div class="progress">
                <div class="progress-bar progress-bar-striped progress-bar-animated bg-danger" role="progressbar"
                    aria-valuenow="75" aria-valuemin="0" aria-valuemax="100" style="width: 0%;"></div>
            </div>
        </div>
    </div>
    <div>
        <marquee>
            <h5> Crypto Market is High now.....</h5>
        </marquee>
    </div>

    <div class="container">
        <div>
            <h3>Crypto Currency List</h3>
        </div>
        <div style="display:flex;">
            <div>
                <a href="#" id="addCrypto" class="btn btn-success">BookMark Crypto</a>
            </div>
        </div>

        <table class="table table-bordered table-responsive"
            style="margin-top: 20px; text-align:center;background-color: #BCD2E5;">
            <thead>
                <tr>
                    <th>Crypto ID</th>
                    <th>Coin Name</th>
                    <th>Price (USD)</th>
                    <th>1hr Volume</th>
                    <th>Data Trade Start</th>
                    <th colspan="2">Actions</th>
                </tr>
            </thead>
            <tbody id="innercryptoList">
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>
                        <a href="javascript:;" class="btn btn-info item-edit" title="Edit details">
                            <span class="svg-icon svg-icon-md"><svg xmlns="http://www.w3.org/2000/svg"
                                    xmlns:xlink="http://www.w3.org/1999/xlink" width="24px" height="24px"
                                    viewBox="0 0 24 24" version="1.1">
                                    <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
                                        <rect x="0" y="0" width="24" height="24" />
                                        <path
                                            d="M8,17.9148182 L8,5.96685884 C8,5.56391781 8.16211443,5.17792052 8.44982609,4.89581508 L10.965708,2.42895648 C11.5426798,1.86322723 12.4640974,1.85620921 13.0496196,2.41308426 L15.5337377,4.77566479 C15.8314604,5.0588212 16,5.45170806 16,5.86258077 L16,17.9148182 C16,18.7432453 15.3284271,19.4148182 14.5,19.4148182 L9.5,19.4148182 C8.67157288,19.4148182 8,18.7432453 8,17.9148182 Z"
                                            fill="#000000" fill-rule="nonzero" \
                                            transform="translate(12.000000, 10.707409) rotate(-135.000000) translate(-12.000000, -10.707409) " />
                                        <rect fill="#fff" opacity="0.6" x="5" y="20" width="15" height="2" rx="1" />
                                    </g>
                                </svg>
                            </span>
                        </a>
                    </td>
                    <td>
                        <a href="javascript:;" class="btn btn-danger item-delete" title="Delete">
                            <span class="svg-icon svg-icon-md"><svg xmlns="http://www.w3.org/2000/svg"
                                    xmlns:xlink="http://www.w3.org/1999/xlink" width="24px" height="24px"
                                    viewBox="0 0 24 24" version="1.1">
                                    <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
                                        <rect x="0" y="0" width="24" height="24" />
                                        <path
                                            d="M6,8 L6,20.5 C6,21.3284271 6.67157288,22 7.5,22 L16.5,22 C17.3284271,22 18,21.3284271 18,20.5 L18,8 L6,8 Z"
                                            fill="#000000" fill-rule="nonzero" />
                                        <path
                                            d="M14,4.5 L14,4 C14,3.44771525 13.5522847,3 13,3 L11,3 C10.4477153,3 10,3.44771525 10,4 L10,4.5 L5.5,4.5 C5.22385763,4.5 5,4.72385763 5,5 L5,5.5 C5,5.77614237 5.22385763,6 5.5,6 L18.5,6 C18.7761424,6 19,5.77614237 19,5.5 L19,5 C19,4.72385763 18.7761424,4.5 18.5,4.5 L14,4.5 Z"
                                            fill="#000000" opacity="0.3" />
                                    </g>
                                </svg>
                            </span>
                        </a>
                    </td>

                </tr>
                <tr>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>
                        <a href="javascript:;" class="btn btn-info item-edit" title="Edit details">
                            <span class="svg-icon svg-icon-md"><svg xmlns="http://www.w3.org/2000/svg"
                                    xmlns:xlink="http://www.w3.org/1999/xlink" width="24px" height="24px"
                                    viewBox="0 0 24 24" version="1.1">
                                    <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
                                        <rect x="0" y="0" width="24" height="24" />
                                        <path
                                            d="M8,17.9148182 L8,5.96685884 C8,5.56391781 8.16211443,5.17792052 8.44982609,4.89581508 L10.965708,2.42895648 C11.5426798,1.86322723 12.4640974,1.85620921 13.0496196,2.41308426 L15.5337377,4.77566479 C15.8314604,5.0588212 16,5.45170806 16,5.86258077 L16,17.9148182 C16,18.7432453 15.3284271,19.4148182 14.5,19.4148182 L9.5,19.4148182 C8.67157288,19.4148182 8,18.7432453 8,17.9148182 Z"
                                            fill="#000000" fill-rule="nonzero" \
                                            transform="translate(12.000000, 10.707409) rotate(-135.000000) translate(-12.000000, -10.707409) " />
                                        <rect fill="#fff" opacity="0.6" x="5" y="20" width="15" height="2" rx="1" />
                                    </g>
                                </svg>
                            </span>
                        </a>
                    </td>
                    <td>
                        <a href="javascript:;" class="btn btn-danger item-delete" title="Delete">
                            <span class="svg-icon svg-icon-md"><svg xmlns="http://www.w3.org/2000/svg"
                                    xmlns:xlink="http://www.w3.org/1999/xlink" width="24px" height="24px"
                                    viewBox="0 0 24 24" version="1.1">
                                    <g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd">
                                        <rect x="0" y="0" width="24" height="24" />
                                        <path
                                            d="M6,8 L6,20.5 C6,21.3284271 6.67157288,22 7.5,22 L16.5,22 C17.3284271,22 18,21.3284271 18,20.5 L18,8 L6,8 Z"
                                            fill="#000000" fill-rule="nonzero" />
                                        <path
                                            d="M14,4.5 L14,4 C14,3.44771525 13.5522847,3 13,3 L11,3 C10.4477153,3 10,3.44771525 10,4 L10,4.5 L5.5,4.5 C5.22385763,4.5 5,4.72385763 5,5 L5,5.5 C5,5.77614237 5.22385763,6 5.5,6 L18.5,6 C18.7761424,6 19,5.77614237 19,5.5 L19,5 C19,4.72385763 18.7761424,4.5 18.5,4.5 L14,4.5 Z"
                                            fill="#000000" opacity="0.3" />
                                    </g>
                                </svg>
                            </span>
                        </a>
                    </td>

                </tr>
            </tbody>
        </table>



    </div>
</body>
<style>
    table tbody tr:nth-child(odd) {
        background-color: #F3FAFF;
    }

    table tbody tr:nth-child(even) {
        background-color: #FFFFFF;
    }

    table tbody tr:hover {
        background-color: #BCD2E5;
    }
</style>

</html>